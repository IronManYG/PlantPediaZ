plugins {
    alias(libs.plugins.plantpediaz.android.library)
}

android {
    namespace = "dev.gaddal.encyclopedia.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.androidx.work)
    implementation(libs.koin.android.workmanager)
    implementation(libs.kotlinx.serialization.json)

    implementation(projects.core.domain)
    implementation(projects.core.database)
    implementation(projects.encyclopedia.domain)
}