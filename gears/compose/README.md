# compose <GitHub path="RedMadRobot/gears-android/tree/main/gears/compose"/>
[![Version](https://img.shields.io/maven-central/v/com.redmadrobot.gears/compose?style=flat-square)][mavenCentral]
[![License](https://img.shields.io/github/license/RedMadRobot/gears-android?style=flat-square)][license]

---
<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->

- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

A set of gears for compose.

## Installation

Add the dependency:
```groovy
repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.redmadrobot.gears:compose:<version>")
}
```

## Usage

|      Gear       | Description |
|:--------------------|:-----------|
| `FixedFontScaleContainer` | A container that fixes the font scale, ignoring values, that are set in the phone's system settings |

## Contributing

Merge requests are welcome.
For major changes, please open an issue first to discuss what you would like to change.


[mavenCentral]: https://search.maven.org/artifact/com.redmadrobot.gears/compose
[license]: ../LICENSE
