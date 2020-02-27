plugins {
    `java-library`
}

dependencies {

    api(project(":data"))

    implementation("com.google.guava:guava")
    implementation(platform(project(":platform")))
}
