import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.3.5.RELEASE"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    kotlin("jvm") version "1.3.72"
    kotlin("plugin.spring") version "1.3.72"
}

group = "asd"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    testImplementation("com.codeborne:selenide:5.15.0")
    testImplementation("org.testng:testng:7.3.0")
}
// Project properties can be accessed via delegation
tasks.withType<Test> {
    useJUnitPlatform()
    filter {
        includeTestsMatching("asd.paralleltests.quick.*")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.register<Test>("testSlow") {
    outputs.upToDateWhen { false }
    useJUnitPlatform()
    filter {
        includeTestsMatching("asd.paralleltests.slow.*")
        excludeTestsMatching("asd.paralleltests.quick.*")
    }
    systemProperty("junit.jupiter.execution.parallel.enabled", true)
//    systemProperty("junit.jupiter.execution.parallel.mode.default", "same_thread")
    systemProperty("junit.jupiter.execution.parallel.mode.default", "concurrent")
    systemProperty("junit.jupiter.execution.parallel.mode.classes.default", "concurrent")

    systemProperty("junit.jupiter.execution.parallel.config.strategy", "fixed")
    systemProperty("junit.jupiter.execution.parallel.config.fixed.parallelism", 12)
}

tasks.register<Test>("testUi") {
    outputs.upToDateWhen { false }
    useJUnitPlatform()
    filter {
        includeTestsMatching("asd.paralleltests.ui.*")
        excludeTestsMatching("asd.paralleltests.quick.*")
    }
    systemProperty("junit.jupiter.execution.parallel.enabled", true)
    systemProperty("junit.jupiter.execution.parallel.mode.default", "concurrent")
    systemProperty("junit.jupiter.execution.parallel.mode.classes.default", "concurrent")

    systemProperty("junit.jupiter.execution.parallel.config.strategy", "fixed")
    systemProperty("junit.jupiter.execution.parallel.config.fixed.parallelism", 2)
}

tasks.register<Test>("testNg") {
    outputs.upToDateWhen { false }
    useTestNG{
        options {
            useDefaultListeners = true
            threadCount = 4
            parallel = "methods"
            println("useDefaultListeners: $useDefaultListeners")
            println("threadCount: $threadCount")
            println("parallelMode: $parallel")
        }
        reports.html.isEnabled = false
        reports.junitXml.isEnabled = false
        println("reports.enabled: ${reports.enabled}")
        println("reports.html.isEnabled: ${reports.html.isEnabled}")
        println("reports.junitXml.isEnabled: ${reports.junitXml.isEnabled}")
    }
    filter {
        includeTestsMatching("asd.paralleltests.slow.*")
    }

}