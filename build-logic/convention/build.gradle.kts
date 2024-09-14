plugins {
    `kotlin-dsl`
}

group = "dev.gaddal.plantpediaz.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "plantpediaz.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "plantpediaz.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
    }
}