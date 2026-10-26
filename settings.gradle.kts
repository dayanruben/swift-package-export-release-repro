pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    val kotlinVersion: String by settings
    plugins {
        kotlin("multiplatform") version kotlinVersion
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "swift-package-export-release-reproducer"
include(":shared")
