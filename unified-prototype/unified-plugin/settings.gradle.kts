dependencyResolutionManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

includeBuild("build-logic")
include("plugin-android")
include("plugin-jvm")
include("plugin-kmp")
include("plugin-swift")
include("plugin-cpp")
include("plugin-common")

rootProject.name = "unified-plugin"
