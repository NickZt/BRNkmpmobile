plugins {
    id("org.jetbrains.compose") version "0.3.1"
    id("com.android.application")
    kotlin("android")
}

group = "brn.mobile"
version = "1.0"

repositories {
    google()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.3.0-alpha03")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "brn.mobile.android"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}