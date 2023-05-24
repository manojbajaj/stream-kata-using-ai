# Stream Kata Using AI

> A code kata is an exercise in programming which helps programmers hone their skills through practice and repetition.
> <cite>https://en.wikipedia.org/wiki/Kata_(programming)</cite>

This repository contains different tasks related to Java Streams. Idea is to solve each task using Java Stream API using AI assistance.


## Setup
Minimal setup is required. Tools you will need:
 - Java 11+ 
 - Maven
 - IDE (In my case IntelliJ IDEA)
 - Github Co-pilot (optional)
 
## How to run exercises
Each exercise is an jUnit test. 
You can run test from both Maven or any modern IDE. 

## Where are answers?
Each task has solution in "Click here to see the answer" block.
<img src="https://github.com/HubertWo/java-stream-kata/blob/master/img/solution.png?raw=true" width="500px">



### Maven
To check *task1* from *Basics* package:
```
mvn surefire:test -Dtest=BasicsTest#task1
```

### IDE
After importing project press "Play" near the test you want to run.

## More
- Java Stream API: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/package-summary.html
- How to run single test using Maven : https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html
- How to run single test using IntelliJ IDEA: https://www.jetbrains.com/help/idea/performing-tests.html 
