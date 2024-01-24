plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.thedogapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.thedogapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.legacy.support.v4)

//    Architecture Components
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

//    RecyclerView
    implementation(libs.androidx.recyclerview)

    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx)

//    Room
//    implementation(libs.androidx.room.runtime)
//    ksp(libs.room.compiler)
//    implementation(libs.androidx.room.ktx)

//    Coroutines
    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)

//    Coroutine Lifecycle Scopes
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.androidx.lifecycle.runtime.ktx)

//    JUnit
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

//    Dagger
    implementation(libs.hilt.android)
    implementation(libs.androidx.hilt.navigation)
    kapt(libs.hilt.compiler)
    kapt(libs.androidx.hilt.compiler)

//    Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation (libs.logging.interceptor)

//    Navigation
    runtimeOnly(libs.navigation.fragment.ktx)
    runtimeOnly(libs.androidx.navigation.ui.ktx)
}