plugins {
    convention.library.android
}

version = "4.2.1-0"
description = "A set of Kotlin extensions for dealing with ViewBinding"

android {
    defaultConfig.consumerProguardFile("viewbinding.pro")
}

dependencies {
    api(kotlin("stdlib"))
    api(libs.androidx.viewbinding)
    api(androidx.fragment) // For ViewBindingDelegate
    implementation(androidx.lifecycle.common)
    implementation(androidx.lifecycle.livedata.core)
}
