plugins {
    alias(libs.plugins.plantpediaz.android.library)
    alias(libs.plugins.plantpediaz.jvm.ktor)
}

android {
    namespace = "dev.gaddal.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}