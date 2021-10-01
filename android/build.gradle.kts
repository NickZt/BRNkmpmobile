plugins {
    id("org.jetbrains.compose") version "0.3.1"
    id("com.android.application")
    kotlin("android")
    id("kotlin-android")
}

group = "brn.mobile"
version = "1.0"
repositories {
    google()
}

dependencies {
    implementation(project(":common"))
    implementation( "androidx.compose.runtime:runtime:1.0.0-beta08")
    implementation( "androidx.compose:compose-compiler:1.0.0-beta08")
    implementation ("androidx.compose.ui:ui:1.0.0-beta08")
    implementation ("androidx.compose.foundation:foundation-layout:1.0.0-beta08")
    implementation ("androidx.compose.material:material:1.0.0-beta08")
    implementation ("androidx.compose.material:material-icons-extended:1.0.0-beta08")
    implementation ("androidx.compose.foundation:foundation:1.0.0-beta08")
    implementation ("androidx.compose.animation:animation:1.0.0-beta08")
    implementation ("androidx.compose.ui:ui-tooling:1.0.0-beta08")
    implementation ("androidx.compose.runtime:runtime-livedata:1.0.0-beta08")
    implementation ("androidx.compose.ui:ui-tooling:1.0.0-beta08")

    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.compose.ui:ui-tooling:1.0.0-beta08")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.0-beta01")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.0.0-beta08")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "brn.mobile.android"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-beta08"
        kotlinCompilerVersion = "1.4.32"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }

}