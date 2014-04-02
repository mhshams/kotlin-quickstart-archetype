# kotlin-quickstart-archetype

A Maven Archetype to Setup Kotlin Applications With Maven.

### Archetype Info
- groupId         : **com.github.mhshams**
- artefactId      : **kotlin-quickstart-archetype**
- (latest) version: **0.0.9**

### Usage

Quick Start Archetype is avaialble in [The Central Repository](http://search.maven.org/#browse), so you just need to execute maven `archetype:generate` in command line or your favorite IDE.

Example:
```
 mvn archetype:generate -DarchetypeGroupId=com.github.mhshams -DarchetypeArtifactId=kotlin-quickstart-archetype -DarchetypeVersion=0.0.9

```

You can set parameter **kotlinVersion** to override default kotlin version.

Example:
```
 mvn archetype:generate -DarchetypeGroupId=com.github.mhshams -DarchetypeArtifactId=kotlin-quickstart-archetype -DarchetypeVersion=0.0.9 -DkotlinVersion=0.7.258

```

For more information about maven archetype plugin, [check this page](http://maven.apache.org/archetype/maven-archetype-plugin/).

### Clone And Build

You can also clone the archetype source code and build it in your local machine:

```
git clone https://github.com/mhshams/kotlin-quickstart-archetype.git

cd kotlin-quickstart-archetype

mvn install

```

