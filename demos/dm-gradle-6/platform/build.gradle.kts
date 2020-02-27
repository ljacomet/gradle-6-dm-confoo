plugins {
    `java-platform`
}

dependencies {
    constraints {
        api("com.google.guava:guava:24.1.1-jre")
        api("com.google.inject:guice") {
            version {
                strictly("[4.0, 5.0[")
                prefer("4.2.0")
                reject("4.2.1")
            }
        }
        api("org.slf4j:slf4j-api:1.7.30")
        runtime("ch.qos.logback:logback-classic:1.2.3")
    }
}
