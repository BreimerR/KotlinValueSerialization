import libetal.gradle.add
import libetal.gradle.fetch

val jvmTarget: String by project
val kotlinVersion: String by project
val projectGroup: String by project
val projectVersion: String by project
val googleAutoServiceVersion: String by project


plugins {
    kotlin("jvm")
    kotlin("kapt")
    kotlin("plugin.serialization")
    id("com.google.protobuf") version "0.8.17"
    id("org.jetbrains.dokka")
    id("java-gradle-plugin")

    signing
    `maven-publish`
}


group = projectGroup
version = projectVersion

dependencies {
    implementation(kotlin("gradle-plugin-api", kotlinVersion))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    // implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    implementation("com.google.protobuf:protobuf-java:+")
    // implementation("org.jetbrains.kotlin:protobuf-java:+")

    add {
        "org.jetbrains.kotlin"{
            "kotlin-compiler-embeddable"(kotlinVersion)

        }
/*        "dev.gradleplugins"(kotlinVersion) {
            +"gradle-api"
        }*/

        "com.google.auto.service"(googleAutoServiceVersion) {
            kaptImplement {
                +"auto-service"
            }
            compileImplement {
                +"auto-service-annotations"
            }
        }

        "com.github.tschuchortdev"("+") {
            testImplement {
                +"kotlin-compile-testing"
            }
        }

        "org.assertj"("3.18.0") {
            testImplement {
                +"assertj-core"
            }
        }

        "org.jetbrains.kotlinx"("+") {
            +"kotlinx-serialization-json"
        }

/*        "libetal.kotlinx.compiler.plugins"("1.0") {
            +"kcp"
        }*/
    }

    testImplementation(kotlin("test", kotlinVersion))
}

sourceSets{
    main{
        proto{

        }
    }
}


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

tasks.register("sourcesJar", Jar::class) {
    group = "build"
    description = "Assembles Kotlin sources"
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
    dependsOn(tasks.classes)
}

gradlePlugin {
    plugins {
        create("plugin") {
            id = "kotlinx.value.serialization"
            description = "Kotlin Value Based Serialization"
            implementationClass = "org.jetbrains.kotlinx.serialization.compiler.plugin.SerializationGradleSubplugin"
        }

    }
}