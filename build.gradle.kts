import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.spring") version "1.9.23"
}

group = "com.chemnitz"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    // Spring Boot starters
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.2")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb:2.6.2")
    implementation("org.springframework.boot:spring-boot-starter-security:2.6.2")

    // Springfox for Swagger
    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("io.springfox:springfox-swagger-ui:3.0.0")

    // Jackson for Kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")

    // Kotlin dependencies
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.10")

    // JWT library
    implementation("io.jsonwebtoken:jjwt:0.9.1")

    // JAXB for XML binding
    implementation("javax.xml.bind:jaxb-api:2.3.1")

    // Development tools
    developmentOnly("org.springframework.boot:spring-boot-devtools:2.6.2")

    // Testing dependencies
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.2")
    testImplementation("org.springframework.security:spring-security-test:5.6.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.8.3")
}


tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
