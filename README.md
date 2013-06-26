# kotlin-quickstart-archetype

A Maven Archetype to Setup Kotlin Applications With Maven.

## Usage

Since the archetype is not available in any online repository yet, you need to check out the source code and build it first.

```
git clone https://github.com/mhshams/kotlin-quickstart-archetype.git

cd kotlin-quickstart-archetype

mvn install

```

After building and installing the archetype in your local repository, you can run maven archetype plugin to build your maven-based kotlin project:

```
 mvn archetype:generate -DarchetypeGroupId=com.github.mhshams -DarchetypeArtifactId=kotlin-quickstart-archetype -DarchetypeVersion=1.0-SNAPSHOT

```
