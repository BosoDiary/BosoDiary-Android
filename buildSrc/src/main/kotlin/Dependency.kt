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
            const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
        }
        object Activity {
            const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:1.3.1"
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
            const val COMPOSE_UI =  "androidx.compose.ui:ui-tooling:${Compose.VERSION}"
        }
    }
}