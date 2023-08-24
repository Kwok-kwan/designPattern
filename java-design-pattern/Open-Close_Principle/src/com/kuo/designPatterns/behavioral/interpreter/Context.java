package com.kuo.designPatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Context
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/24
 * @description 环境角色类
 */
public class Context {
    private Map<Variable,Integer> map = new HashMap<>();

    public void assign(Variable var , Integer value){
        map.put(var,value);
    }

    public int getValue(Variable var){
        return map.get(var);
    }
}
