# Android-FeatureFlags
Still a WIP


## Local Development
For this project there are several build variants defined in order demonstrate the usage of feature flags.
Gradle commands by convention are build using the following combination:
```
GRADLE TASK NAME: gradle task + product flavor + build type
```

### Unit Tests
* `./gradlew runUnitTests` - Execute all unit tests for this project.

## Build Variants
### DEBUG
* `./gradlew assembleDemoDebug` - Assembles the **DEMO DEBUG** version of the app.
* `./gradlew assembleFullDebug` - Assembles the **FULL DEBUG** of the app.
* `./gradlew runDemoDebug` - Builds and installs the **DEMO DEBUG** apk on the current connected device.
* `./gradlew runFullDebug` - Builds and installs the **FULL DEBUG** apk on the current connected device.

### STAGING
* `./gradlew assembleDemoStaging` - Assembles the **DEMO STAGING** version of the app.
* `./gradlew assembleFullStaging` - Assembles the **FULL STAGING** of the app.
* `./gradlew runDemoStaging` - Builds and installs the **DEMO STAGING** apk on the current connected device.
* `./gradlew runFullStaging` - Builds and installs the **FULL STAGING** apk on the current connected device.

### RELEASE
* `./gradlew assembleDemoRelease` - Assembles the **DEMO RELEASE** version of the app.
* `./gradlew assembleFullRelease` - Assembles the **FULL RELEASE** of the app.
* `./gradlew runDemoRelease` - Builds and installs the **DEMO RELEASE** apk on the current connected device.
* `./gradlew runFullRelease` - Builds and installs the **FULL RELEASE** apk on the current connected device.

#### References
* [Fernando Cejas Blog Post](https://fernandocejas.com)
* [Build Variants Android Official Doc](https://developer.android.com/studio/build/build-variants)



## License

    Copyright 2020 Fernando Cejas

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


![http://www.fernandocejas.com](https://github.com/android10/Sample-Data/blob/master/android10/android10_logo_big.png)

<a href="https://www.buymeacoffee.com/android10" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>
