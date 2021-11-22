import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
}

group = "ru.sazhina"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.rest-assured:rest-assured:4.4.0")
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.kotest:kotest-runner-junit5-jvm:4.6.+")
    implementation("io.kotest:kotest-assertions-core-jvm:4.6.+")
    implementation("io.kotest:kotest-property:4.6.+")
    implementation("io.kotest:kotest-framework-engine-jvm:4.6.+")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.0")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}