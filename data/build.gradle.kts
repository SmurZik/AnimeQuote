plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm)
}
dependencies {
    implementation(project(":domain"))

    implementation(libs.javax.inject)
    api(libs.converter.gson)
    api(libs.retrofit)
}
