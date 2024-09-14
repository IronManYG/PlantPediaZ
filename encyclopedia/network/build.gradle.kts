plugins {
    alias(libs.plugins.plantpediaz.android.library)
}

android {
    namespace = "dev.gaddal.encyclopedia.network"
}

dependencies {
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.core.data)
}