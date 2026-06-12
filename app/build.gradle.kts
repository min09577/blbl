import java.net.URL

plugins {
    id("com.android.application")
    id("org.jlleitschuh.gradle.ktlint")
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

    val protocClassifier =
        when {
            org.gradle.internal.os.OperatingSystem
                .current()
                .isWindows -> "windows-x86_64"
            org.gradle.internal.os.OperatingSystem
                .current()
                .isMacOsX ->
                if (System.getProperty("os.arch") == "aarch64") "osx-aarch_64" else "osx-x86_64"
            else ->
                if (System.getProperty("os.arch") == "aarch64") "linux-aarch_64" else "linux-x86_64"
        }

    add("protobufTools", "com.google.protobuf:protoc:3.25.3:$protocClassifier@exe")
    add("protobufTools", "io.grpc:protoc-gen-grpc-java:1.72.0:$protocClassifier@exe")

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
        val resolved = protobufTools.resolvedConfiguration.resolvedArtifacts
        val protocExe =
            resolved.find { it.moduleVersion.id.name == "protoc" }?.file
                ?: error("protoc artifact not found in protobufTools configuration")
        val grpcPluginExe =
            resolved.find { it.moduleVersion.id.name == "protoc-gen-grpc-java" }?.file
                ?: error("protoc-gen-grpc-java artifact not found in protobufTools configuration")

        // protoc from Maven lacks the include/ directory; download full distribution from GitHub
        val protoIncludeDir =
            layout.buildDirectory
                .dir("tmp/proto-include")
                .get()
                .asFile
        if (!protoIncludeDir.resolve("google/protobuf/any.proto").exists()) {
            val protoZip =
                layout.buildDirectory
                    .file("tmp/protoc-dist.zip")
                    .get()
                    .asFile
            protoZip.parentFile.mkdirs()
            val protocDist =
                when {
                    org.gradle.internal.os.OperatingSystem
                        .current()
                        .isWindows -> "win64"
                    org.gradle.internal.os.OperatingSystem
                        .current()
                        .isMacOsX ->
                        if (System.getProperty("os.arch") == "aarch64") "osx-aarch_64" else "osx-x86_64"
                    else ->
                        if (System.getProperty("os.arch") == "aarch64") "linux-aarch_64" else "linux-x86_64"
                }
            val url = URL("https://github.com/protocolbuffers/protobuf/releases/download/v25.3/protoc-25.3-$protocDist.zip")
            url.openStream().use { inp ->
                protoZip.outputStream().use { out -> inp.copyTo(out) }
            }
            project.copy {
                from(project.zipTree(protoZip)) { include("include/**") }
                into(protoIncludeDir)
            }
            protoZip.delete()
        }

        val outputDir = protoOutputDir.get().asFile
        outputDir.deleteRecursively()
        outputDir.mkdirs()

        val cmd =
            mutableListOf(
                protocExe.absolutePath,
                "-I${protoSourceDir.asFile.absolutePath}",
                "-I${protoIncludeDir.resolve("include").absolutePath}",
                "--java_out=lite:${outputDir.absolutePath}",
                "--grpc_out=lite:${outputDir.absolutePath}",
                "--plugin=protoc-gen-grpc=${grpcPluginExe.absolutePath}",
            )
        cmd.addAll(protoFiles.files.map { it.absolutePath })

        val process = ProcessBuilder(cmd).redirectErrorStream(true).start()
        val stdout = process.inputStream.bufferedReader().readText()
        val exitCode = process.waitFor()
        if (exitCode != 0) {
            error("protoc failed (exit $exitCode):\n$stdout")
        }

        logger.lifecycle(
            "protoc: generated {} Java files from {} proto sources",
            fileTree(outputDir) { include("**/*.java") }.files.size,
            protoFiles.files.size,
        )
    }
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
