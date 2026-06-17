package blbl.build

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.net.URL
import java.util.zip.ZipInputStream

abstract class GenerateProto : DefaultTask() {

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val protoFiles: ConfigurableFileCollection

    @get:Input
    abstract val protoSourceRoot: Property<String>

    @get:OutputDirectory
    abstract val protoOutputDir: DirectoryProperty

    @get:Internal
    abstract val workDir: DirectoryProperty

    @get:Input
    abstract val windowsHost: Property<Boolean>

    @get:Input
    abstract val protocDistSuffix: Property<String>

    @TaskAction
    fun generate() {
        val build = workDir.get().asFile
        val output = protoOutputDir.get().asFile
        val isWin = windowsHost.get()

        val toolsDir = File(build, "tmp/protoc-tools")
        val protoIncludeDir = File(build, "tmp/proto-include")
        val protocExe = File(toolsDir, if (isWin) "protoc.exe" else "protoc")
        val protoSourceDir = File(protoSourceRoot.get())

        // Download protoc binary + includes from GitHub Release (cached in build/tmp)
        if (!protocExe.exists() || !protoIncludeDir.resolve("google/protobuf/any.proto").exists()) {
            val protoZip = File(build, "tmp/protoc-dist.zip")
            protoZip.parentFile.mkdirs()
            val dist = protocDistSuffix.get()
            val url = URL("https://github.com/protocolbuffers/protobuf/releases/download/v25.3/protoc-25.3-$dist.zip")
            logger.lifecycle("protoc: downloading protoc-25.3-$dist.zip...")
            val inp = url.openStream()
            try { inp.copyTo(protoZip.outputStream()) } finally { inp.close() }

            val extractDir = File(build, "tmp/protoc-extract")
            extractDir.deleteRecursively()
            ZipInputStream(protoZip.inputStream().buffered()).use { zis ->
                var entry = zis.nextEntry
                while (entry != null) {
                    val entryFile = File(extractDir, entry.name)
                    if (entry.isDirectory) {
                        entryFile.mkdirs()
                    } else {
                        entryFile.parentFile.mkdirs()
                        entryFile.outputStream().buffered().use { fos -> zis.copyTo(fos) }
                    }
                    entry = zis.nextEntry
                }
            }
            val srcProtoc = File(extractDir, if (isWin) "bin/protoc.exe" else "bin/protoc")
            if (srcProtoc.exists()) {
                toolsDir.mkdirs()
                srcProtoc.copyTo(protocExe, overwrite = true)
            }
            val srcInclude = File(extractDir, "include")
            if (srcInclude.isDirectory) {
                protoIncludeDir.deleteRecursively()
                srcInclude.copyRecursively(protoIncludeDir, overwrite = true)
            } else {
                srcInclude.renameTo(protoIncludeDir)
            }
            extractDir.deleteRecursively()
            protoZip.delete()
        } else {
            logger.lifecycle("protoc: using cached protoc")
        }

        protocExe.setExecutable(true)
        if (!isWin) {
            ProcessBuilder("chmod", "+x", protocExe.absolutePath).start().waitFor()
        }

        output.deleteRecursively()
        output.mkdirs()

        val cmd = mutableListOf(
            protocExe.absolutePath,
            "-I${protoSourceDir.absolutePath}",
            "-I${protoIncludeDir.absolutePath}",
            "--java_out=lite:${output.absolutePath}",
        )
        cmd.addAll(protoFiles.files.map { it.absolutePath })

        val process = ProcessBuilder(cmd).redirectErrorStream(true).start()
        val stdout = process.inputStream.bufferedReader().readText()
        val exitCode = process.waitFor()
        if (exitCode != 0) error("protoc failed (exit $exitCode):\n$stdout")

        val javaCount = output.walkTopDown().count { it.isFile && it.extension == "java" }
        logger.lifecycle(
            "protoc: generated {} Java files from {} proto sources",
            javaCount,
            protoFiles.files.size,
        )
    }
}
