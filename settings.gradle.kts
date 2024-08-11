plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "Telegram"

include(":javaModels")
include(":telemetryClients:java")
include(":telemetryClients:csharp")
include(":telemetryServer")
include(":telemetryViewers:desktop")
include(":telemetryViewers:web")