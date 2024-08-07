plugins {
    id("java")
}

group = "edu.panov.spring"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-core:6.1.5")
    implementation("org.springframework:spring-context:6.1.5")
    implementation("org.springframework:spring-beans:6.1.5")
    compileOnly("org.projectlombok:lombok:1.18.30")
    implementation("jakarta.annotation:jakarta.annotation-api:3.0.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}


tasks.getByName<Test>("test") {
    useJUnitPlatform()
}