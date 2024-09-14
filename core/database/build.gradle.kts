plugins {
    alias(libs.plugins.plantpediaz.android.library)
}

android {
    namespace = "dev.gaddal.core.database"
}

dependencies {
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
}