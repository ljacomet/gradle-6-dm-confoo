plugins {
    `java-library`
}

val loud: SourceSet by sourceSets.creating
java {
    registerFeature("loud") {
        usingSourceSet(loud)
    }
}

dependencies {

    api(project(":data"))

    implementation("com.google.guava:guava")
    implementation(platform(project(":platform")))
    implementation("org.slf4j:slf4j-api")

    runtimeOnly("org.slf4j:slf4j-simple:1.7.30")

    "loudApi"(project(":data"))
    "loudImplementation"("org.apache.commons:commons-lang3:3.7")

    testImplementation(testFixtures(project(":data")))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.withType<Test> {
    useJUnitPlatform()
}