pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    includeBuild("unified-plugin")
}

plugins {
    id("org.gradle.experimental.android-ecosystem")
    id("org.gradle.experimental.kmp-ecosystem")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

rootProject.name = "unified-prototype"

include("testbed-android-library")
include("testbed-android-application")
include("testbed-kmp")
include("testbed-jvm")
include("testbed-jvm-groovy")
include("testbed-java-application")
