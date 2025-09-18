// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Safe Args plugin for Java
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.0")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
}
