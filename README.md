# Java 2D experiments

In this project, we create a simple java graphic application capable
of displaying a variety of different 2d shapes. Color, scale, text, 
rotation will be added. An approach to load the elements from a file
will be included.

## Setup project 

Using gradle, create a simple application for building, runniing, testing and packaging.
(My preference, at this time is gradle, although maven could also be used.)

```aidl
$ gradle init
[2] application
[3] java
[1] application
[1] groovy
[yes]
[4] junit jupiter
name: 2d
source_package: ont777767ltd.twod

```

This will build a gradle based project, with a default `Hello World`

### Test the initial project

```aidl
$ gradle run

> Task :app:run
Hello World!

BUILD SUCCESSFUL in 2s
2 actionable tasks: 1 executed, 1 up-to-date
```

and

```aidl
[~/projects/home/java/2d]  $ gradle test

BUILD SUCCESSFUL in 2s
3 actionable tasks: 1 executed, 2 up-to-date
```

##  Convert to a simple tool

Things to think about:
1. Need a Shape sub-package for creating shapes.
2. Need an ui subpackage for handling mouse clicks.
3. ...

So, what I want to create here is a bunch of shape objects that I can "draw" onto a frame.
I will need to create a JFrame. I'll need some UI elements.

For now, create a basic structure with some simple shapes:

```aidl
app/src/main
├── java
│   └── ont777767ltd
│       └── twod
│           ├── App.java
│           ├── DrawingCanvas.java
│           ├── shapes
│           │   ├── Circle.java
│           │   ├── Cloud.java
│           │   ├── Hexagon.java
│           │   ├── Line.java
│           │   ├── MyPolygon.java
│           │   ├── Rect.java
│           │   ├── Shape.java
│           │   └── Spiral.java
│           └── ui
│               └── MyMouseListener.java
└── resources
```

## Create a git repo for this project

At this point, need to track changes and such.

```aidl
git init
```

### Need a .gitignore

The default `.gitignore`  will be:

```aidl
[~/projects/home/java/2d]  $ cat .gitignore
# Ignore Gradle project-specific cache directory
.gradle

# Ignore Gradle build output directory
build
```

You should add other files here too - for example, I use intellij, 
so I added `.idea/`

To check hhat will be added:

```aidl
[~/projects/home/java/2d]  $ git status --untracked-files
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	.gitattributes
	.gitignore
	README.md
	app/build.gradle
	app/src/main/java/ont777767ltd/twod/App.java
	app/src/main/java/ont777767ltd/twod/DrawingCanvas.java
	app/src/main/java/ont777767ltd/twod/shapes/Circle.java
	app/src/main/java/ont777767ltd/twod/shapes/Cloud.java
	app/src/main/java/ont777767ltd/twod/shapes/Hexagon.java
	app/src/main/java/ont777767ltd/twod/shapes/Line.java
	app/src/main/java/ont777767ltd/twod/shapes/MyPolygon.java
	app/src/main/java/ont777767ltd/twod/shapes/Rect.java
	app/src/main/java/ont777767ltd/twod/shapes/Shape.java
	app/src/main/java/ont777767ltd/twod/shapes/Spiral.java
	app/src/main/java/ont777767ltd/twod/ui/MyMouseListener.java
	app/src/test/java/ont777767ltd/twod/AppTest.java
	gradle/wrapper/gradle-wrapper.properties
	gradlew
	gradlew.bat
	settings.gradle

nothing added to commit but untracked files present (use "git add" to track)
```

##  Runnable JAR

Need to modify the build.gradle and add a manifest for the jar:

```aidl
$ vim app/build.gradle
```
add in 
```aidl

+  34 jar {
+  35   manifest {
+  36     attributes(
+  37       'Class-Path': configurations.runtimeClasspath.files.collect { it.getName() }.join(' '),
+  38       'Main-Class': 'ont777767ltd.twod.App'
+  39     )
+  40   }
+  41 }

```

and then build:

```aidl
[~/projects/home/java/java2d]  (main) $ gradle jar

BUILD SUCCESSFUL in 873ms
2 actionable tasks: 2 up-to-date
```

and run:

```aidl
[~/projects/home/java/java2d]  (main) $ java -jar app/build/libs/app.jar
Hello World!
```
