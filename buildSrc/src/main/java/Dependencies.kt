object Plugins {
    const val agp = "com.android.tools.build:gradle:4.0.1"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0-rc"
}

object Dependencies {
    object Kotlin {
        object Coroutines {
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.8-1.4.0-rc"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8-1.4.0-rc"
        }
    }

    object AndroidX {
        const val activity_ktx = "androidx.activity:activity-ktx:1.2.0-alpha07"
        const val annotation = "androidx.annotation:annotation:1.2.0-alpha01"
        const val appcompat = "androidx.appcompat:appcompat:1.3.0-alpha01"
        const val constraint_layout = "androidx.constraintlayout:constraintlayout:2.0.0-beta8"
        const val core_ktx = "androidx.core:core-ktx:1.5.0-alpha01"
        const val fragment_ktx = "androidx.fragment:fragment-ktx:1.3.0-alpha07"
        const val lifecycle_common = "androidx.lifecycle:lifecycle-common-java8:2.3.0-alpha06"
        const val lifecycle_livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.0-alpha06"
        const val lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.0-alpha06"
        const val material = "com.google.android.material:material:1.3.0-alpha01"
        const val preference = "androidx.preference:preference:1.1.1"
        const val recycler_view = "androidx.recyclerview:recyclerview:1.2.0-alpha05"
        const val recycler_view_selection = "androidx.recyclerview:recyclerview-selection:1.1.0-rc01"
        const val room_compiler = "androidx.room:room-compiler:2.2.5"
        const val room_ktx = "androidx.room:room-ktx:2.2.5"
        const val viewpager2 = "androidx.viewpager2:viewpager2:1.1.0-alpha01"
    }

    object ThirdParty {
        const val glide = "com.github.bumptech.glide:glide:4.11.0"
        const val glide_compiler = "com.github.bumptech.glide:glide:4.11.0"
        const val koin_android = "org.koin:koin-android:2.1.3"
        const val koin_androidx_scope = "org.koin:koin-androidx-scope:2.1.3"
        const val koin_androidx_viewmodel = "org.koin:koin-androidx-viewmodel:2.1.3"
        const val lottie = "com.airbnb.android:lottie:3.4.1"
        const val material_rating_bar = "me.zhanghai.android.materialratingbar:library:1.4.0"
        const val okhttp_logging_interceptor = "com.squareup.okhttp3:logging-interceptor:4.7.2"
        const val retrofit_converter_gson = "com.squareup.retrofit2:converter-gson:2.8.1"
        const val timber = "com.jakewharton.timber:timber:4.7.1"
        const val timberkt = "com.github.ajalt:timberkt:1.5.1"
        const val whatthestack = "com.github.haroldadmin:WhatTheStack:0.0.4"
    }

    object Testing {
        const val junit = "junit:junit:4.13"
        const val kotlin_test_junit = "org.jetbrains.kotlin:kotlin-test-junit:1.3.72"

        object AndroidX {
            const val runner = "androidx.test:runner:1.3.0-rc01"
            const val rules = "androidx.test:rules:1.3.0-rc01"
            const val junit = "androidx.test.ext:junit:1.1.2-rc01"
            const val espresso_core = "androidx.test.espresso:espresso-core:3.3.0-rc01"
            const val espresso_intents = "androidx.test.espresso:espresso-intents:3.3.0-rc01"
        }
    }
}
