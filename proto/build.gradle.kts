plugins {
    id("java-library")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    api("com.google.protobuf:protobuf-javalite:4.35.1")
    api("io.grpc:grpc-protobuf-lite:1.72.0")
    api("io.grpc:grpc-stub:1.72.0")
    api("io.grpc:grpc-okhttp:1.72.0")
    compileOnly("javax.annotation:javax.annotation-api:1.3.2")
}

// --- Protobuf code generation (protobuf java only; gRPC stubs pre-generated in src/generated/java) ---

val protoSrcDir = layout.projectDirectory.dir("src/main/proto")
val protoGenDir = layout.buildDirectory.dir("generated/source/proto/main/java")

val generateProto by tasks.registering(blbl.build.GenerateProto::class) {
    group = "protobuf"
    description = "Generate Java-lite sources from .proto files (protoc only, no gRPC)"

    protoFiles.from(fileTree(protoSrcDir) { include("**/*.proto") })
    protoSourceRoot.set(protoSrcDir.asFile.absolutePath)
    protoOutputDir.set(protoGenDir)
    workDir.set(layout.buildDirectory)

    val osName = System.getProperty("os.name").lowercase()
    val isWin = osName.contains("windows")
    windowsHost.set(isWin)
    protocDistSuffix.set(
        when {
            isWin -> "win64"
            osName.contains("mac") ->
                if (System.getProperty("os.arch") == "aarch64") "osx-aarch_64" else "osx-x86_64"
            else ->
                if (System.getProperty("os.arch") == "aarch64") "linux-aarch_64" else "linux-x86_64"
        },
    )
}

tasks.named("compileJava").configure {
    dependsOn(generateProto)
}

sourceSets {
    main {
        java {
            srcDir(protoGenDir)
            // Pre-generated gRPC stubs (committed to repo; regenerate locally when .proto changes)
            srcDir(layout.projectDirectory.dir("src/generated/java"))
        }
    }
}
