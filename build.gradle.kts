plugins {
    kotlin("jvm") version "2.0.21"
}

group = "egenity.combo"
version = "0.2-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("org.ow2.sat4j:org.ow2.sat4j.maxsat:2.3.5")

    // --- Test dependencies ---
    testImplementation(kotlin("test")) // Kotlin test API
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.11.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.0")

    testImplementation("org.ow2.sat4j:org.ow2.sat4j.maxsat:2.3.5")
}

tasks.test {
    useJUnitPlatform()
}
