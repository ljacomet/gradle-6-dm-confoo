plugins {
    application
}

application {
    mainClassName = "org.gradle.hello6.HelloApp"
}

dependencies {
    implementation(platform(project(":platform")))

    implementation(project(":hello-java-service"))

    implementation("com.google.inject:guice")
}
