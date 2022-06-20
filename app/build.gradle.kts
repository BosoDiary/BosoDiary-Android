import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    kotlin("kapt")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.secretdiary"
        minSdk = 30
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = Dependency.AndroidX.Test.TEST_INSTRUMENTATION_RUNNER
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependency.AndroidX.Compose.VERSION // compose_version
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    namespace = "com.example.secretdiary"
}

dependencies {

    implementation(Dependency.AndroidX.CORE_KTX)
    implementation(Dependency.AndroidX.Compose.UI)
    implementation(Dependency.AndroidX.Compose.MATERIAL)
    implementation(Dependency.AndroidX.Compose.UI_TOOLING_PREVIEW)
    implementation(Dependency.AndroidX.Lifecycle.LIFECYCLE_RUNTIME_KTX)
    implementation(Dependency.AndroidX.Activity.ACTIVITY_COMPOSE)
    testImplementation(Dependency.AndroidX.Test.JUNIT)
    androidTestImplementation(Dependency.AndroidX.AndroidTest.JUNIT)
    androidTestImplementation(Dependency.AndroidX.AndroidTest.ESPRESSO)
    androidTestImplementation(Dependency.AndroidX.AndroidTest.COMPOSE_UI_TEST)
    debugImplementation(Dependency.AndroidX.Debug.COMPOSE_UI)

    // ViewModel
    implementation(Dependency.AndroidX.Lifecycle.VIEWMODEL)
    // LiveData
    implementation(Dependency.AndroidX.Lifecycle.LIVEDATA)

    // Saved state module for ViewModel
    implementation(Dependency.AndroidX.Lifecycle.VIEWMODEL_SAVEDSTATE)
    implementation(("com.google.firebase:firebase-analytics"))
    implementation(platform("com.google.firebase:firebase-bom:30.1.0"))
    implementation("com.google.firebase:firebase-common-ktx:20.1.1")
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.android.gms:play-services-auth:20.1.0")


    // Annotation processor
    implementation(Dependency.AndroidX.Lifecycle.LIFECYCLE_COMMON_JAVA8)

    // viewModelScope
    implementation(Dependency.AndroidX.Lifecycle.VIEWMODEL_SCOPE)
    // lifecycleScope
    implementation(Dependency.AndroidX.Lifecycle.LIFECYCLE_SCOPE)
    // livedata builder
    implementation(Dependency.AndroidX.Lifecycle.LIVEDATA_BUILDER)

    // ViewModel 가져올 때 by viewModels() 사용 위해 필요
    implementation(Dependency.AndroidX.Activity.ACTIVITY_KTX)
    implementation(Dependency.AndroidX.Fragment.FRAGMENT_KTX)

    // navigation
    implementation(Dependency.AndroidX.Navigation.COMPOSE_NAVIGATION)

    implementation(Dependency.AndroidX.Jetpack.Hilt)
}