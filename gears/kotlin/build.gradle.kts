plugins {
    id("com.redmadrobot.kotlin-library")
    convention.publishing
    convention.detekt
}

version = "1.9.23-0"
description = "A set of gears for kotlin"

dependencies {
    api(kotlin("stdlib"))
}
