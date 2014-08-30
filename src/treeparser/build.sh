#!/bin/bash
export CLASSPATH=".:/home/mamk/jscstudy/simple-javascript-engine/tool/antlr-3.5.1-complete.jar:$CLASSPATH"

java -jar /home/mamk/jscstudy/simple-javascript-engine/tool/antlr-3.5.1-complete.jar *.g
javac *.java

echo "Please Run java Main input"
