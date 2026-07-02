pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }           // Android plugins
        mavenCentral()         // Kotlin plugins
        gradlePluginPortal()   // Gradle plugins
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()                // Android libraries
        mavenCentral()          // Other libraries
    }
}

rootProject.name = "KisaanApp"
include(":app")
 