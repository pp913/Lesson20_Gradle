plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testImplementation group: 'com.consol.citrus', name: 'citrus-base', version: '3.4.0'
    testImplementation group: 'com.consol.citrus', name: 'citrus-testng', version: '3.4.0'
    testImplementation group: 'com.consol.citrus', name: 'citrus-spring', version: '3.4.0'
    testImplementation group: 'com.consol.citrus', name: 'citrus-http', version: '3.4.0'
    testImplementation group: 'com.consol.citrus', name: 'citrus-validation-json', version: '3.4.0'

    testImplementation group: 'org.slf4j', name: 'slf4j-reload4j', version: '2.0.7'

    testCompileOnly group: 'org.projectlombok', name: 'lombok', version: '1.18.28'
    testAnnotationProcessor group: 'org.projectlombok', name: 'lombok', version: '1.18.28'

}

tasks.test {
    useJUnitPlatform()
}