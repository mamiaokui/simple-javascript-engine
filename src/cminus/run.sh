#!/bin/bash
export CLASSPATH=".:./com/yangqi/cminus:./com/yangqi/cminus/nodes:/home/yangqi3/src/board/common/simple-javascript-engine/tool/antlr-3.5.1-complete.jar:$CLASSPATH"

java com.yangqi.cminus.Main test.cm

