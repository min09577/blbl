import java.net.URL

plugins {
    id("com.android.application")
    id("org.jlleitschuh.gradle.ktlint")
    id("io.gitlab.arturbosch.detekt")
}

android {
    namespace = "blbl.cat3399"
    compileSdk = 36

    fun propOrEnv(name: String): String? {
        val fromProp = project.findProperty(name) as String?
        if (!fromProp.isNullOrBlank()) return fromProp
        val fromEnv = System.getenv(name)
        if (!fromEnv.isNullOrBlank()) return fromEnv
        return null
    }

    defaultConfig {
        applicationId = "blbl.cat3399"
        minSdk = 21
        targetSdk = 36
        versionCode = (project.findProperty("versionCode") as String?)?.toInt() ?: 18
        versionName = project.findProperty("versionName") as String? ?: "11.19.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    signingConfigs {
        create("release") {
            storeFile = file(System.getenv("RELEASE_KEYSTORE_PATH") ?: rootProject.file("keystore/release.keystore").absolutePath)
            storePassword = propOrEnv("RELEASE_STORE_PASSWORD") ?: ""
            keyAlias = propOrEnv("RELEASE_KEY_ALIAS") ?: ""
            keyPassword = propOrEnv("RELEASE_KEY_PASSWORD") ?: ""
        }
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    buildFeatures {
        buildConfig = true
        viewBinding = true
    }

    sourceSets {
        getByName("main") {
            java.directories.add("build/generated/source/proto/debug/java")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    packaging {
        resources {
            excludes +=
                setOf(
                    "META-INF/DEPENDENCIES",
                    "META-INF/LICENSE*",
                    "META-INF/NOTICE*",
                    "META-INF/*.kotlin_module",
                )
        }
        jniLibs {
            // IjkPlayer native libs are shipped as an on-demand plugin (downloaded when needed).
            excludes += setOf("**/libijkplayer.so")
        }
    }
}

// --- Protobuf tools configuration (must be declared before dependencies block) ---
val protobufTools =
    configurations.create("protobufTools") {
        isCanBeConsumed = false
        isCanBeResolved = true
    }

val protoSourceDir = layout.projectDirectory.dir("src/main/proto")
val protoOutputDir = layout.buildDirectory.dir("generated/source/proto/debug/java")

dependencies {
    implementation(files("libs/ijkplayer-cmake-release.aar"))

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.9.0")

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.brotli:dec:0.1.2")

    implementation("androidx.media3:media3-exoplayer:1.8.0")
    implementation("androidx.media3:media3-exoplayer-hls:1.8.0")
    implementation("androidx.media3:media3-ui:1.8.0")
    implementation("androidx.media3:media3-datasource-okhttp:1.8.0")

    implementation("com.google.protobuf:protobuf-javalite:3.25.5")
    implementation("io.grpc:grpc-okhttp:1.72.0")
    implementation("io.grpc:grpc-protobuf-lite:1.72.0")
    implementation("io.grpc:grpc-stub:1.72.0")
    compileOnly("javax.annotation:javax.annotation-api:1.3.2")
    implementation("com.google.zxing:core:3.5.3")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.9.0")
    testImplementation("org.robolectric:robolectric:4.14.1")
}

// --- Protobuf code generation task ---

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
        val grpcPluginExe = File(toolsDir, "protoc-gen-grpc-java" + if (isWindows) ".exe" else "")

        val protocDist =
            when {
                isWindows -> "win64"
                isMac ->
                    if (System.getProperty("os.arch") == "aarch64") "osx-aarch_64" else "osx-x86_64"
                else ->
                    if (System.getProperty("os.arch") == "aarch64") "linux-aarch_64" else "linux-x86_64"
            }
        val protocGrpcClassifier =
            when {
                isWindows -> "windows-x86_64"
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
            url.openStream().use { inp -> protoZip.outputStream().use { out -> inp.copyTo(out) } }

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

        // Download protoc-gen-grpc-java from Maven Central (direct HTTP, avoids Gradle dependency resolution)
        if (!grpcPluginExe.exists()) {
            grpcPluginExe.parentFile.mkdirs()
            val grpcUrl =
                URL(
                    "https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.72.0/protoc-gen-grpc-java-1.72.0-$protocGrpcClassifier.exe",
                )
            logger.lifecycle("protoc: downloading protoc-gen-grpc-java 1.72.0 from Maven Central...")
            grpcUrl.openStream().use { inp -> grpcPluginExe.outputStream().use { out -> inp.copyTo(out) } }
        } else {
            logger.lifecycle("protoc: using cached protoc-gen-grpc-java")
        }

        protocExe.setExecutable(true)
        grpcPluginExe.setExecutable(true)

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

tasks.named("preBuild").configure {
    dependsOn(generateProto)
}

// Enforce theme-token usage in layouts so adding new theme presets doesn't silently break contrast.
val checkThemeTokens =
    tasks.register("checkThemeTokens") {
        group = "verification"
        description = "Fails if layouts reference fixed palette colors instead of theme attributes."

        doLast {
            val resDir = file("src/main/res")
            val layoutDirs =
                resDir
                    .listFiles()
                    ?.filter { it.isDirectory && it.name.startsWith("layout") }
                    .orEmpty()

            fun isWordChar(c: Char): Boolean = c.isLetterOrDigit() || c == '_'

            // Match whole resource refs (word boundary) to avoid false positives like
            // `@color/blbl_text_on_media` or `@drawable/blbl_focus_bg_round_danger`.
            fun containsWholeToken(
                line: String,
                token: String,
            ): Boolean {
                var fromIndex = 0
                while (true) {
                    val idx = line.indexOf(token, startIndex = fromIndex)
                    if (idx < 0) return false
                    val before = line.getOrNull(idx - 1)
                    val after = line.getOrNull(idx + token.length)
                    val beforeOk = before == null || !isWordChar(before)
                    val afterOk = after == null || !isWordChar(after)
                    if (beforeOk && afterOk) return true
                    fromIndex = idx + token.length
                }
            }

            val forbidden =
                listOf(
                    "@color/blbl_bg",
                    "@color/blbl_surface",
                    "@color/blbl_text",
                    "@color/blbl_text_secondary",
                    "@color/blbl_focus_stroke",
                    "@drawable/blbl_focus_bg_round",
                )

            val violations = mutableListOf<String>()
            for (dir in layoutDirs) {
                dir
                    .walkTopDown()
                    .filter { it.isFile && it.extension.equals("xml", ignoreCase = true) }
                    .forEach { f ->
                        val relPath = f.relativeTo(projectDir).invariantSeparatorsPath
                        val lines = f.readLines(Charsets.UTF_8)
                        for ((index, line) in lines.withIndex()) {
                            for (token in forbidden) {
                                if (containsWholeToken(line, token)) {
                                    violations.add("$relPath:${index + 1}: $token")
                                }
                            }
                        }
                    }
            }

            if (violations.isNotEmpty()) {
                val msg =
                    buildString {
                        appendLine("Theme token check failed: layouts must use theme attributes, not fixed palette colors.")
                        appendLine(
                            "Use ?attr/colorOnSurface, ?android:attr/textColorSecondary, ?attr/colorBackground, " +
                                "?attr/colorSurface, ?attr/blblOnPageBackdrop, ?attr/blblFocusBgRound, " +
                                "?attr/blblFocusStrokeColor, etc.",
                        )
                        appendLine("Violations:")
                        violations.forEach { appendLine("  $it") }
                    }
                throw GradleException(msg)
            }
        }
    }

checkThemeTokens.configure {
    notCompatibleWithConfigurationCache("Scans layout XML for theme tokens")
}

tasks.named("preBuild").configure {
    dependsOn(checkThemeTokens)
}

ktlint {
    android.set(true)
    outputToConsole.set(true)
    reporters {
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.PLAIN)
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.CHECKSTYLE)
    }
    filter {
        exclude("**/proto/**")
    }
}

detekt {
    buildUponDefaultConfig = true
    allRules = false
    config.setFrom(file("$rootDir/config/detekt/detekt.yml"))
    baseline = file("$rootDir/config/detekt/baseline.xml")
    parallel = true
}

tasks.withType<io.gitlab.arturbosch.detekt.Detekt>().configureEach {
    reports {
        html.required.set(true)
        html.outputLocation.set(file("build/reports/detekt/detekt.html"))
        txt.required.set(true)
        txt.outputLocation.set(file("build/reports/detekt/detekt.txt"))
        xml.required.set(true)
        xml.outputLocation.set(file("build/reports/detekt/detekt.xml"))
    }
}
