// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.4.2")
        classpath(kotlin("gradle-plugin", "1.3.31"))
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.1.0-beta02")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://www.jitpack.io")

    }
}

task<Delete>("clean"){
    delete(rootProject.buildDir)
}
