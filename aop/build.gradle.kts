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

    implementation("org.aspectj:aspectjweaver:1.9.22.1")
    implementation("org.springframework:spring-aop:6.1.11")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}