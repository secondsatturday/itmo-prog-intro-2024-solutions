#! /usr/bin/bash

javac -d ./classes Sum/Sum.java
java -classpath ./classes Sum.Sum "1 2" "3"