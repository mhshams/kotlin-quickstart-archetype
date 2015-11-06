# kotlin-quickstart-archetype

A Maven Archetype to Setup Kotlin Applications With Maven.
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)
 
### Archetype Info
- groupId         : **com.github.mhshams**
- artifactId      : **kotlin-quickstart-archetype**
- (latest) version: **0.1.0**
[![Build Status](https://travis-ci.org/mhshams/kotlin-quickstart-archetype.svg?branch=master)](https://travis-ci.org/mhshams/kotlin-quickstart-archetype)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.mhshams/kotlin-quickstart-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.mhshams/kotlin-quickstart-archetype)

### Usage

Quick Start Archetype is available in [The Central Repository](http://search.maven.org/#browse), so you just need to execute maven `archetype:generate` in command line or your favorite IDE.

Example:
```bash
 mvn archetype:generate \
    -DarchetypeGroupId=com.github.mhshams \
    -DarchetypeArtifactId=kotlin-quickstart-archetype \
    -DarchetypeVersion=0.1.0
 
```

The default kotlin version is **1.0.0-beta-1103** but you can override it by setting **kotlinVersion** parameter during build.

Example:
```bash
 $ mvn archetype:generate \
    -DarchetypeGroupId=com.github.mhshams \
    -DarchetypeArtifactId=kotlin-quickstart-archetype \
    -DarchetypeVersion=0.1.0 \
    -DkotlinVersion=1.0.0-beta-1103

```

For more information about maven archetype plugin, [check this page](http://maven.apache.org/archetype/maven-archetype-plugin/).

### Clone And Build

You can also clone the archetype source code and build it in your local machine:

```bash
$ git clone https://github.com/mhshams/kotlin-quickstart-archetype.git
$ cd kotlin-quickstart-archetype
$ mvn install

```

