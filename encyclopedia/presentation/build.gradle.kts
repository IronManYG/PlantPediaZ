plugins {
    alias(libs.plugins.plantpediaz.android.feature.ui)
}

android {
    namespace = "dev.gaddal.encyclopedia.presentation"
}

dependencies {
    implementation(libs.coil.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)
    implementation(libs.lottie)

    implementation(projects.core.domain)
    implementation(projects.encyclopedia.domain)
    implementation(libs.androidx.navigation.common.ktx)
}