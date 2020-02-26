plugins {
    application
    id("dev.jacomet.logging-capabilities") version "0.8.0"
}

application {
    mainClassName = "org.gradle.hello6.HelloApp"
}

dependencies {
    implementation(platform(project(":platform")))

    implementation(project(":hello-java-service"))
    implementation(project(":hello-java-service")) {
        capabilities { requireCapability("org.gradle.hello6:hello-java-service-loud") }
    }

    implementation("com.google.inject:guice")
    implementation("org.slf4j:slf4j-api")

    runtimeOnly("ch.qos.logback:logback-classic")
}

loggingCapabilities {
    enforceLogback()
}