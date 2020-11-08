# clean-note

#Check for dependencies update
This project uses [https://github.com/ben-manes/gradle-versions-plugin] to check for new updates of dependencies.
Please run ./gradlew dependencyUpdates in order to check for an update.

# Code style
This project uses ktlint, provided via the spotless gradle plugin.

Please run ./gradlew spotlessApply before merging pull requests to format all code and apply the appropriate copyright headers.

# License
Copyright 2020 Hesam.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
