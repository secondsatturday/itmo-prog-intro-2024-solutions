#! /usr/bin/bash

javac -d ./classes sum/Sum.java
java -classpath ./classes sum.Sum "     123     456     789     "