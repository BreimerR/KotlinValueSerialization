import libetal.gradle.add

val jvmTarget: String by project
val kotlinVersion: String by project
val projectGroup: String by project
val projectVersion: String by project
val googleAutoServiceVersion: String by project


plugins {
    kotlin("multiplatform")
    kotlin("kapt")
    id("org.jetbrains.dokka")

    signing
    id("maven-publish")
}

repositories {
    mavenCentral()
    mavenLocal()
}

group = projectGroup
version = projectVersion

kotlin {

    jvm {
        withJava()
    }

    sourceSets {
        val jvmMain by getting {
            dependencies {
                compileOnly(kotlin("gradle-plugin"))
                compileOnly(kotlin("stdlib"))
                api(kotlin("gradle-plugin-api"))
                implementation("com.google.protobuf:protobuf-java:+")

                add(project) {
                    "org.jetbrains.kotlin"(kotlinVersion) {
                        +"kotlin-compiler-embeddable"
                    }

                    "com.google" {
                        "auto.service"(googleAutoServiceVersion) {
                            kaptImplement {
                                +"auto-service"
                            }
                            compileImplement {
                                +"auto-service-annotations"
                            }
                        }
                        "protobuf"{
                            "protobuf-java"("3.18.1")
                        }

                    }

                    "libetal"{
                        "kotlinx"{
                            "compiler"{
                                "plugins"("1.0") {
                                    +"kcp"
                                }
                            }
                        }
                    }

                    "org.jetbrains.kotlinx"("+") {
                        +"kotlinx-serialization-json"
                    }

                    "libetal.kotlinx.compiler.plugins"("1.0") {
                        +"kcp"
                    }

                    project {
                        +"annotations"
                    }
                }
            }
        }
        val jvmTest by getting {
            dependencies {
                add(project) {
                    "org.assertj"("3.18.0") {
                        +"assertj-core"
                    }
                }
            }
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = jvmTarget

    kotlinOptions {
        //freeCompilerArgs += "-Xopt-in=ObsoleteDescriptorBasedAPI"
        freeCompilerArgs = freeCompilerArgs + "-Xjvm-default=enable"

    }

}

tasks.withType<Tar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<Zip> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
/*
tasks.register("sourcesJar", Jar::class) {
    group = "build"
    description = "Assembles Kotlin sources"
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
    dependsOn(tasks.classes)
}
*/

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = jvmTarget


    kotlinOptions {
        //freeCompilerArgs += "-Xopt-in=ObsoleteDescriptorBasedAPI"
        freeCompilerArgs += "-Xjvm-default=enable"

    }

}



tasks.withType<Tar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<Zip> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
/*
tasks.register("sourcesJar", Jar::class) {
    group = "build"
    description = "Assembles Kotlin sources"
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
    dependsOn(tasks.classes)
}
*/
