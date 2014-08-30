#!/bin/bash
export CLASSPATH=".:/home/yangqi3/src/board/common/simple-javascript-engine/tool/antlr-3.5.1-complete.jar:$CLASSPATH"

java -jar /home/yangqi3/src/board/common/simple-javascript-engine/tool/antlr-3.5.1-complete.jar *.g
javac *.java

echo "Please Run java Main input"
