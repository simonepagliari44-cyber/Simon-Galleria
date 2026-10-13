pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { setUrl("${rootDir}/local-repo") }
        google()
        mavenCentral()
        maven { setUrl("https://www.jitpack.io") }
        mavenLocal()
    }
}

rootProject.name = "Simon-Galleria"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")

