plugins {
    id("java-library")
}

import java.net.URL

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    api("com.google.protobuf:protobuf-javalite:3.25.5")
    api("io.grpc:grpc-protobuf-lite:1.72.0")
    api("io.grpc:grpc-stub:1.72.0")
    api("io.grpc:grpc-okhttp:1.72.0")
    compileOnly("javax.annotation:javax.annotation-api:1.3.2")
}

// --- Protobuf code generation task ---

val protoSourceDir = layout.projectDirectory.dir("src/main/proto")
val protoOutputDir = layout.buildDirectory.dir("generated/source/proto/main/java")

val generateProto by tasks.registering {
    group = "protobuf"
    description = "Generate Java lite + gRPC lite sources from .proto files"

    val protoFiles = fileTree(protoSourceDir) { include("**/*.proto") }
    inputs.files(protoFiles)
    outputs.dir(protoOutputDir)

    doLast {
        val toolsDir =
            layout.buildDirectory
                .dir("tmp/protoc-tools")
                .get()
                .asFile
        val protoIncludeDir =
            layout.buildDirectory
                .dir("tmp/proto-include")
                .get()
                .asFile
        val osName = System.getProperty("os.name").lowercase()
        val isWindows = osName.contains("windows")
        val isMac = osName.contains("mac")
        val protocExe = File(toolsDir, if (isWindows) "protoc.exe" else "protoc")

        val protocDist =
            when {
                isWindows -> "win64"
                isMac ->
                    if (System.getProperty("os.arch") == "aarch64") "osx-aarch_64" else "osx-x86_64"
                else ->
                    if (System.getProperty("os.arch") == "aarch64") "linux-aarch_64" else "linux-x86_64"
            }

        // Download protoc binary + includes from GitHub Release (cached)
        if (!protocExe.exists() || !protoIncludeDir.resolve("google/protobuf/any.proto").exists()) {
            val protoZip =
                layout.buildDirectory
                    .file("tmp/protoc-dist.zip")
                    .get()
                    .asFile
            protoZip.parentFile.mkdirs()
            val url = URL("https://github.com/protocolbuffers/protobuf/releases/download/v25.3/protoc-25.3-$protocDist.zip")
            logger.lifecycle("protoc: downloading protoc-25.3-$protocDist.zip from GitHub...")
            val inp = url.openStream()
            try { inp.copyTo(protoZip.outputStream()) } finally { inp.close() }

            // Extract entire zip to temp dir, then copy needed files
            val extractDir =
                layout.buildDirectory
                    .dir("tmp/protoc-extract")
                    .get()
                    .asFile
            extractDir.deleteRecursively()
            project.copy {
                from(project.zipTree(protoZip))
                into(extractDir)
            }
            val srcProtoc = File(extractDir, if (isWindows) "bin/protoc.exe" else "bin/protoc")
            if (srcProtoc.exists()) {
                toolsDir.mkdirs()
                srcProtoc.copyTo(protocExe, overwrite = true)
            }
            val srcInclude = File(extractDir, "include")
            if (srcInclude.isDirectory) {
                protoIncludeDir.deleteRecursively()
                srcInclude.renameTo(protoIncludeDir)
            }
            extractDir.deleteRecursively()
            protoZip.delete()
        } else {
            logger.lifecycle("protoc: using cached protoc binary and includes")
        }

        protocExe.setExecutable(true)
        if (!isWindows) {
            val chmod = ProcessBuilder("chmod", "+x", protocExe.absolutePath).start()
            chmod.waitFor()
        }

        // Download protoc-gen-grpc-java native binary from Maven Central
        val protocGrpcClassifier =
            when {
                isWindows -> "windows-x86_64"
                isMac ->
                    if (System.getProperty("os.arch") == "aarch64") "osx-aarch_64" else "osx-x86_64"
                else ->
                    if (System.getProperty("os.arch") == "aarch64") "linux-aarch_64" else "linux-x86_64"
            }
        val grpcPluginExe = File(toolsDir, "protoc-gen-grpc-java" + if (isWindows) ".exe" else "")
        if (!grpcPluginExe.exists()) {
            toolsDir.mkdirs()
            val grpcUrl =
                URL(
                    "https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.72.0/protoc-gen-grpc-java-1.72.0-$protocGrpcClassifier.exe",
                )
            logger.lifecycle("protoc: downloading protoc-gen-grpc-java 1.72.0 from Maven Central...")
            val inp = grpcUrl.openStream()
            try { inp.copyTo(grpcPluginExe.outputStream()) } finally { inp.close() }
        } else {
            logger.lifecycle("protoc: using cached protoc-gen-grpc-java")
        }

        grpcPluginExe.setExecutable(true)
        val magic = ByteArray(4)
        grpcPluginExe.inputStream().use { it.read(magic) }
        val isElf = magic[0] == 0x7f.toByte() && magic[1] == 0x45.toByte() && magic[2] == 0x4c.toByte() && magic[3] == 0x46.toByte()
        logger.lifecycle("protoc: grpc plugin size=${grpcPluginExe.length()}, isELF=$isElf")
        // Debug: test if OS can execute the binary
        if (!isWindows && isElf) {
            val linker = java.io.File("/lib64/ld-linux-x86-64.so.2")
            logger.lifecycle("protoc: ld-linux.so.2 exists=${linker.exists()}")
            try {
                // Test: can the kernel exec this binary at all?
                val testBin = ProcessBuilder(grpcPluginExe.absolutePath).redirectErrorStream(true).start()
                testBin.outputStream.close() // close stdin
                val out = testBin.inputStream.bufferedReader().readText()
                val ec = testBin.waitFor()
                logger.lifecycle("protoc: test exec exit=$ec, out=${out.take(200)}")
            } catch (e: Exception) {
                logger.lifecycle("protoc: test exec EXCEPTION: ${e.javaClass.simpleName}: ${e.message}")
            }
        }
        if (!isWindows && !grpcPluginExe.canExecute()) {
            val chmod = ProcessBuilder("chmod", "+x", grpcPluginExe.absolutePath).start()
            chmod.waitFor()
            logger.lifecycle("protoc: after chmod canExecute=${grpcPluginExe.canExecute()}")
        }

        val outputDir = protoOutputDir.get().asFile
        outputDir.deleteRecursively()
        outputDir.mkdirs()

        val cmd =
            mutableListOf(
                protocExe.absolutePath,
                "-I${protoSourceDir.asFile.absolutePath}",
                "-I${protoIncludeDir.absolutePath}",
                "--java_out=lite:${outputDir.absolutePath}",
                "--grpc_out=lite:${outputDir.absolutePath}",
                "--plugin=protoc-gen-grpc=${grpcPluginExe.absolutePath}",
            )
        cmd.addAll(protoFiles.files.map { it.absolutePath })

        val process = ProcessBuilder(cmd).redirectErrorStream(true).start()
        val stdout = process.inputStream.bufferedReader().readText()
        val exitCode = process.waitFor()
        if (exitCode != 0) error("protoc failed (exit $exitCode):\n$stdout")

        logger.lifecycle(
            "protoc: generated {} Java files from {} proto sources",
            fileTree(outputDir) { include("**/*.java") }.files.size,
            protoFiles.files.size,
        )
    }
}

generateProto.configure {
    notCompatibleWithConfigurationCache("Downloads protoc from GitHub releases")
}

tasks.named("compileJava").configure {
    dependsOn(generateProto)
}

sourceSets {
    main {
        java {
            srcDir(protoOutputDir)
        }
    }
}
