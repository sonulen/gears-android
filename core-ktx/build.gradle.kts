plugins {
    convention.library.android
}

version = "1.6.0-2"
description = "Kotlin extensions in addition to androidx core-ktx"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(androidx.core)
}
