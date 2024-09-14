plugins {
    alias(libs.plugins.plantpediaz.android.library)
    alias(libs.plugins.plantpediaz.android.room)
}

android {
    namespace = "dev.gaddal.core.database"
}

dependencies {
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
}