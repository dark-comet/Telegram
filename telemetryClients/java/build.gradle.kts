plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit)
    testRuntimeOnly(libs.junitLauncher)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(8)
    }

    sourceSets {
        main {
            java {
                srcDir("src/main/java")
            }
        }

        test {
            java {
                srcDir("src/test/java")
            }
        }
    }
}

version = "0.1"