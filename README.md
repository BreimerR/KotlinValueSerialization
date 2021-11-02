# Kotlin Value Serialization (Non-Official-Project)

This is a copy of the Kotlin Serialization Compiler Plugin The code base is borrowed
from [Kotlin Serialization Compiler Plugin](https://github.com/JetBrains/kotlin/tree/master/plugins/kotlin-serialization/kotlin-serialization-compiler)

# Reason For Library

- Kotlin Serialization requires creating surrogate classes inorder to support for properties without
  backing fields.

## NB

This is not a rewrite of the kotlin serialization compiler plugin All code is copied from the base
kotlin source with a few changes to support for non backing field properties.

## Requirements

- libBuildSrc
- KCP (Kotlin Compiler Plugin API)

```
repositories{
    mavenLocal()
}

dependencies{
  implementation("libetal.gradle.plugin:kcp:1.0")
}

```


## Drawbacks
- Code insight isn't available yet. I don't know how to integrate it yet 😅

## 