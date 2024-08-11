plugins {
    id("application")
    alias(libs.plugins.javafx)
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
        languageVersion = JavaLanguageVersion.of(21)
    }

    sourceSets {
        main {
            java {
                srcDir("src/main/java")
            }
            resources {
                srcDir("src/main/resources")
            }
        }

        test {
            java {
                srcDir("src/test/java")
            }
            resources {
                srcDir("src/test/resources")
            }
        }
    }
}

application {
    mainClass = "xyz.darkcomet.telegram.viewer.desktop.Main"
}

javafx {
    version = "22.0.1"
    modules("javafx.controls")
}

version = "0.1"