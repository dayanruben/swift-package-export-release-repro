@file:OptIn(org.jetbrains.kotlin.gradle.swiftexport.ExperimentalSwiftExportDsl::class)

plugins {
    kotlin("multiplatform")
}

kotlin {
    iosArm64()
    iosSimulatorArm64()

    export {
        swift {
            moduleName = "Composables"
            rootPackage = "example.shared"
            swiftPackageIntegration()
        }
    }
}
