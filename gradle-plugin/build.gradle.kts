val jvmTarget: String by project
val kotlinVersion: String by project
val projectGroup: String by project
val projectVersion: String by project
val googleAutoServiceVersion: String by project

plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
    id("com.gradle.plugin-publish") version "+"

    `java-gradle-plugin`
    signing
    `maven-publish`
}
repositories {
    mavenCentral()
}

group = projectGroup
version = projectVersion

dependencies {
    implementation(kotlin("stdlib",kotlinVersion))
    implementation(kotlin("gradle-plugin-api", kotlinVersion))
}

gradlePlugin {
    plugins {
        create("ValueSerializationGradlePlugin") {
            id = "value.serialization"
            displayName = "Kotlin Value Serialization Plugin"
            description = "Does serialization using property value getters"
            implementationClass = "libetal.kotlinx.serialization.plugin.ValueSerialization"
        }
    }
}