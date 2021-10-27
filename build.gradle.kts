import libetal.gradle.implementation

val kotlinVersion: String by project
val dokkaVersion: String by project
val projectGroup: String by project
val projectVersion: String by project

buildscript {
    repositories {
        mavenCentral()
/*        mavenCentral()
        mavenLocal()

        gradlePluginPortal()*/
    }
    val kotlinVersion: String by project
    val dokkaVersion: String by project
    val projectGroup: String by project
    val projectVersion: String by project



    dependencies {
        classpath(kotlin("gradle-plugin", kotlinVersion))
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:$dokkaVersion")
        classpath(kotlin("serialization", kotlinVersion))
    }
}

configurations.all {
    resolutionStrategy {
        force( "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
        force( "org.jetbrains.kotlin:kotlin-stdlib :$kotlinVersion")
    }
}


allprojects {
    repositories {
        mavenCentral()
    }
}