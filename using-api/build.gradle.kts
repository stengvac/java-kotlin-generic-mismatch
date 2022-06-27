plugins {
    id("java")
}

group = "org.example"

dependencies {
    implementation("org.example:generated-api:1.0")
    //with this one IDE does not show any error
//    implementation(project(":generated-api"))
}
