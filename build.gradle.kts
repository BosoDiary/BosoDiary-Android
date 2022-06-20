// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    dependencies {
        classpath("com.google.gms:google-services:4.3.10")

    }
    repositories {
        // Check that you have the following line (if not, add it):
        google()  // Google's Maven repository

    }
}
plugins {
    id("com.android.application") version "7.2.0" apply false
    id("com.android.library") version "7.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.6.10" apply false

}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}