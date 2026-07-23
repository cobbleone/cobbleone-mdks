# Cobbleone Templates

Templates for creating Hytale server plugins.

## Getting started

Choose the template you want to use:

- `example-java` — Java template, available now
- `example-kotlin` — Kotlin template, coming soon

The setup and workflow are the same for both templates.

### Requirements

- Java 25
- A local Hytale installation
- IntelliJ IDEA (recommended)

### Start the project

1. Open the template folder (`example-java` or `example-kotlin`) in IntelliJ IDEA.
2. Allow IntelliJ to import the Gradle project.
3. Update the values in `gradle.properties`, especially `mod_name`, `mod_description`, and `mod_version`.
4. Add your plugin code in the template's source folder.

The project automatically looks for Hytale in its default installation folder. If Hytale is installed somewhere else, set the path with:

```text
-PhytaleHome=/path/to/Hytale
```

### Build

From the selected template directory, run this in a terminal with a POSIX shell (macOS, Linux, Git Bash, or WSL):

```bash
./gradlew build
```

The plugin JAR is created in `build/libs`.

### Run

In IntelliJ IDEA:

1. Open the Gradle project.
2. Select the `HytaleServer` run configuration.
3. Start the configuration.

The server uses the `run` directory for its working files and starts with the project resources.
