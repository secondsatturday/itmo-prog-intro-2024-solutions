#! /usr/bin/bash

javac -d ./classes reverse/Reverse.java
cd classes
java -ea -jar ~/Source/itmo-prog-intro-2024-solutions/artifacts/ReverseTest.jar Base