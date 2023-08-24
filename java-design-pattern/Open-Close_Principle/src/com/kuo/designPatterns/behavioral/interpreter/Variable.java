package com.kuo.designPatterns.behavioral.interpreter;

/**
 * Variable
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/24
 * @description 变量类
 */
public class Variable extends AbstractExpression{
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {

        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
