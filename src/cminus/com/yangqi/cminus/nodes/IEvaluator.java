package com.yangqi.cminus.nodes;

public interface IEvaluator
{
    CMinusValue eval(CMinusState state) throws Exception;
}
