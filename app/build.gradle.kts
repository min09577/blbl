plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
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
        minSdk = 19
        multiDexEnabled = true
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

    flavorDimensions += "api"
    productFlavors {
        register("kitkat") {
            dimension = "api"
            minSdk = 19
            applicationIdSuffix = ".kitkat"
            signingConfig = signingConfigs.getByName("release")
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
        compose = true
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

dependencies {
    implementation(project(":proto"))

    implementation(files("libs/ijkplayer-cmake-release.aar"))

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    // Compose BOM — AGP auto-resolves compiler plugin for Kotlin 2.0.21
    val composeBom = platform("androidx.compose:compose-bom:2024.12.01")
    implementation(composeBom)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.9.3")
    debugImplementation("androidx.compose.ui:ui-tooling")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.9.0")

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.brotli:dec:0.1.2")

    implementation("androidx.media3:media3-exoplayer:1.4.1")
    implementation("androidx.media3:media3-exoplayer-hls:1.4.1")
    implementation("androidx.media3:media3-ui:1.4.1")
    implementation("androidx.media3:media3-datasource-okhttp:1.4.1")

    implementation("com.google.zxing:core:3.5.3")

    // MultiDex for KitKat (DEX 64K limit)
    implementation("androidx.multidex:multidex:2.0.1")

    // KitKat (API 19) compatibility - lower media3 version for minSdk 19
    "kitkatImplementation"("androidx.media3:media3-exoplayer:1.4.1")
    "kitkatImplementation"("androidx.media3:media3-exoplayer-hls:1.4.1")
    "kitkatImplementation"("androidx.media3:media3-ui:1.4.1")
    "kitkatImplementation"("androidx.media3:media3-datasource:1.4.1")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.9.0")
    testImplementation("org.robolectric:robolectric:4.14.1")
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
