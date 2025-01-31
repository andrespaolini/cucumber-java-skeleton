plugins {
    java
}
dependencies {
    implementation("org.testng:testng:7.7.0")
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation(platform("io.cucumber:cucumber-bom:7.11.2"))

    testImplementation("io.cucumber:cucumber-java")
    testImplementation("io.cucumber:cucumber-junit-platform-engine")
    testImplementation("org.junit.platform:junit-platform-suite")
    testImplementation("org.junit.jupiter:junit-jupiter")
}

repositories {
    mavenLocal()
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
    // Work around. Gradle does not include enough information to disambiguate
    // between different examples and scenarios.
    systemProperty("cucumber.junit-platform.naming-strategy", "long")
}
