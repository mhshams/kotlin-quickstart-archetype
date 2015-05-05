# kotlin-quickstart-archetype

A Maven Archetype to Setup Kotlin Applications With Maven.
[![License](https://pypip.in/license/apache-libcloud/badge.png)]()
 
### Archetype Info
- groupId         : **com.github.mhshams**
- artifactId      : **kotlin-quickstart-archetype**
- (latest) version: **0.0.11**
[![Build Status](https://travis-ci.org/mhshams/kotlin-quickstart-archetype.svg?branch=master)](https://travis-ci.org/mhshams/kotlin-quickstart-archetype)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.mhshams/kotlin-quickstart-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.mhshams/kotlin-quickstart-archetype)

### Usage

Quick Start Archetype is available in [The Central Repository](http://search.maven.org/#browse), so you just need to execute maven `archetype:generate` in command line or your favorite IDE.

Example:
```bash
 mvn archetype:generate -DarchetypeGroupId=com.github.mhshams -DarchetypeArtifactId=kotlin-quickstart-archetype -DarchetypeVersion=0.0.11
 
```

You can set parameter **kotlinVersion** to override default kotlin version.

Example:
```bash
 $ mvn archetype:generate -DarchetypeGroupId=com.github.mhshams -DarchetypeArtifactId=kotlin-quickstart-archetype -DarchetypeVersion=0.0.11 -DkotlinVersion=0.11.91.4

```

For more information about maven archetype plugin, [check this page](http://maven.apache.org/archetype/maven-archetype-plugin/).

### Clone And Build

You can also clone the archetype source code and build it in your local machine:

```bash
$ git clone https://github.com/mhshams/kotlin-quickstart-archetype.git
$ cd kotlin-quickstart-archetype
$ mvn install

```

