plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm)
}
dependencies {
    implementation(project(":domain"))

    implementation(libs.converter.gson)
    implementation(libs.retrofit)
}
