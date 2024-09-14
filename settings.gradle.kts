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

rootProject.name = "PlantPedia Z"
include(":app")
include(":core:data")
include(":core:database")
include(":core:domain")
include(":core:presentation:designsystem")
include(":core:presentation:ui")
include(":encyclopedia:data")
include(":encyclopedia:domain")
include(":encyclopedia:presentation")
