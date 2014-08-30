#!/bin/bash
export CLASSPATH=".:/home/mamk/jscstudy/simple-javascript-engine/tool/antlr-3.5.1-complete.jar:$CLASSPATH"

java -jar ../../../simple-javascript-engine/tool/antlr-3.5.1-complete.jar ./com/yangqi/cminus/nodes/*.g 
java -jar ../../../simple-javascript-engine/tool/antlr-3.5.1-complete.jar ./com/yangqi/cminus/parser/*.g

javac ./com/yangqi/cminus/*.java
javac ./com/yangqi/cminus/nodes/*.java
javac ./com/yangqi/cminus/parser/*.java

echo "Please Run run.sh"
