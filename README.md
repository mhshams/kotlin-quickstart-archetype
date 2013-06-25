# kotlin-archetype-quickstart

A Maven Archetype to Setup Kotlin Applications With Maven.

## Usage

Since the archetype is not available in any online repository yet, you need to check out the source code and build it first.

```
git clone https://github.com/mhshams/kotlin-archetype-quickstart.git

cd kotlin-archetype-quickstart

mvn install

```

After building and installing the arechetype in your local repository, you can run maven archetype plugin to build your maven-based kotlin project:

```
 mvn archetype:generate -DarchetypeGroupId=kotlin-archetype-quickstart -DarchetypeArtifactId=kotlin-archetype-quickstart -DarchetypeVersion=1.0-SNAPSHOT^C

```
