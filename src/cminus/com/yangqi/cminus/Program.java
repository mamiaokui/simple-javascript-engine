package com.yangqi.cminus;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.yangqi.cminus.nodes.CMinusProgram;
import com.yangqi.cminus.nodes.CMinusState;
import com.yangqi.cminus.nodes.CMinusTree;
import com.yangqi.cminus.nodes.CMinusValue;
import com.yangqi.cminus.parser.CMinusLexer;
import com.yangqi.cminus.parser.CMinusParser;

public class Program
{
    public static void main(String[] args) throws Exception
    {
        CMinusLexer lexer = new CMinusLexer(new ANTLRFileStream("test.cm"));
        CMinusParser parser = new CMinusParser(new CommonTokenStream(lexer));
        CMinusParser.program_return program = parser.program();
        CommonTree tree = (CommonTree)program.getTree();
        
        System.out.println(tree.toStringTree());
        CMinusTree walker = new CMinusTree(new CommonTreeNodeStream(tree));
        
        CMinusTree.program_return ast = walker.program();
        CMinusProgram realProgram = ast.rv;
        System.out.println("parsing ok!");
        
        CMinusValue v = realProgram.eval(new CMinusState());
        System.out.println("program returned: <" +
            v.type + "> " + v.value);
    }

}
