package com.yangqi.cminus.nodes;

public class CMinusVariable implements IEvaluator
{
    String id;

    public CMinusVariable(String id)
    {
        super();
        this.id = id;
    }

    @Override
    public CMinusValue eval(CMinusState state) throws Exception
    {
        return state.peekVariable(id);
    }

}
