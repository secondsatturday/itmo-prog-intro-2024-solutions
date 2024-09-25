#! /usr/bin/bash

javac -d ./classes sum/Sum.java
cd classes
java -ea -jar ~/Source/itmo-prog-intro-2024-solutions/artifacts/SumTest.jar Base