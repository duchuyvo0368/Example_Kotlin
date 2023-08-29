plugins {
    kotlin("jvm") version "1.8.20" // Đảm bảo sử dụng phiên bản Kotlin hợp lệ
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1") // Thêm dependency cho coroutines
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("MainKt")
}
