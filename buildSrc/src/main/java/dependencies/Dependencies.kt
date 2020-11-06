package dependencies

object Dependencies {
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"

    const val firebase_analytics = "com.google.firebase:firebase-analytics-ktx:${Versions.firebase_analytics}"
    const val firebase_auth = "com.google.firebase:firebase-auth:${Versions.firebase_auth}"
    const val firebase_crashlytics = "com.google.firebase:firebase-crashlytics:${Versions.firebase_crashlytics}"
    const val firebase_firestore = "com.google.firebase:firebase-firestore-ktx:${Versions.firebase_firestore}"

    const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val kotlin_coroutines_play_services = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutines_play_services}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val kotlin_standard_library = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    const val leak_canary = "com.squareup.leakcanary:leakcanary-android:${Versions.leak_canary}"
    const val lifecycle_coroutines = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"

    const val material_dialogs = "com.afollestad.material-dialogs:core:${Versions.material_dialogs}"
    const val material_dialogs_input = "com.afollestad.material-dialogs:input:${Versions.material_dialogs}"
    const val markdown_processor = "com.yydcdut:markdown-processor:${Versions.markdown_processor}"

    const val navigation_dynamic = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.nav_components}"
    const val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_components}"
    const val navigation_runtime = "androidx.navigation:navigation-runtime:${Versions.nav_components}"
    const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.nav_components}"

    const val play_core = "com.google.android.play:core:${Versions.play_core}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit2}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit2}"
    const val room_ktx = "androidx.room:room-ktx:${Versions.room}"
    const val room_runtime = "androidx.room:room-runtime:${Versions.room}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}
