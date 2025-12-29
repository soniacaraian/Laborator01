pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Laborator01"

// Include labtasks app module
include(":labtasks-app")
project(":labtasks-app").projectDir = file("labtasks/MyFirstAndroidApplication/app")

// Include solutions app module
include(":solutions-app")
project(":solutions-app").projectDir = file("solutions/MyFirstAndroidApplication/app")
