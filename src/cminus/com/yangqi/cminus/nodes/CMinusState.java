package com.yangqi.cminus.nodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CMinusState
{
    Map<String, Stack<CMinusValue>> variables = new HashMap<String, Stack<CMinusValue>>();
    public Stack<CMinusValue> stack = new Stack<CMinusValue>();
    
    public CMinusValue popVariable(String id)
    {
        return variables.get(id).pop();
    }
    
    public CMinusValue peekVariable(String id)
    {
        return variables.get(id).peek();
    }
    
    public void pushVariable(String id, CMinusValue val)
    {
        if(!variables.containsKey(id))
            variables.put(id, new Stack<CMinusValue>());
        
        variables.get(id).push(val);
    }
}
