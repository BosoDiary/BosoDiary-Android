object Dependency {
    object AndroidX {
        const val CORE_KTX = "androidx.core:core-ktx:1.7.0"

        object Compose {
            const val VERSION = "1.1.1"
            const val UI = "androidx.compose.ui:ui:$VERSION"
            const val MATERIAL = "androidx.compose.material:material:$VERSION"
            const val UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:$VERSION"
        }

        object Lifecycle {
            const val VERSION = "2.4.1"

            const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"

            const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$VERSION"
            const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:$VERSION"
            const val VIEWMODEL_SAVEDSTATE =
                "androidx.lifecycle:lifecycle-viewmodel-savedstate:$VERSION"
            const val LIFECYCLE_COMMON_JAVA8 = "androidx.lifecycle:lifecycle-common-java8:$VERSION"
            const val VIEWMODEL_SCOPE = "androidx.lifecycle:lifecycle-viewmodel-ktx:$VERSION"
            const val LIFECYCLE_SCOPE = "androidx.lifecycle:lifecycle-runtime-ktx:$VERSION"
            const val LIVEDATA_BUILDER = "androidx.lifecycle:lifecycle-livedata-ktx:$VERSION"
        }

        object Jetpack {
            const val Hilt = "com.google.dagger:hilt-android:${Versions.Jetpack.Hilt}"
            const val HiltCompiler =
                "com.google.dagger:hilt-android-compiler:${Versions.Jetpack.Hilt}"

        }


        object Activity {
            const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:1.3.1"
            const val ACTIVITY_KTX = "androidx.activity:activity-ktx:1.4.0"
        }

        object Fragment {
            const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:1.4.0"
        }

        object Test {
            const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
            const val JUNIT = "junit:junit:4.13.2"
        }

        object AndroidTest {
            const val JUNIT = "androidx.test.ext:junit:1.1.3"
            const val ESPRESSO = "androidx.test.espresso:espresso-core:3.4.0"
            const val COMPOSE_UI_TEST = "androidx.compose.ui:ui-test-junit4:${Compose.VERSION}"
        }

        object Debug {
            const val COMPOSE_UI = "androidx.compose.ui:ui-tooling:${Compose.VERSION}"
        }

        object Navigation {
            const val VERSION = "2.4.2"

            const val COMPOSE_NAVIGATION = "androidx.navigation:navigation-compose:$VERSION"

        }
    }
}