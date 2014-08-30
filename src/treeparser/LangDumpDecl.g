tree grammar LangDumpDecl;
options {
    tokenVocab=Lang;
    ASTLabelType = Tree;
}

start: decl+ ;

decl : ^(DECL type declarator)
       {System.out.println("int "+$declarator.text);}
     ;

type : INTTYPE 
     | FLOATTYPE
     ;

declarator
     : ID
     ;
