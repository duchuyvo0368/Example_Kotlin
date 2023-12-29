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

    //
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.2.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.1.1")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:adapter-rxjava3:2.9.0")


    // RxJava3
    implementation("io.reactivex.rxjava3:rxjava:3.1.6")


}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("MainKt")
}
