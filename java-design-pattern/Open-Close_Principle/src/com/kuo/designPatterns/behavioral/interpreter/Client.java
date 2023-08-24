package com.kuo.designPatterns.behavioral.interpreter;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/24
 * @description 解释器模式
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        context.assign(a,1);
        context.assign(b,1);
        context.assign(c,1);
        context.assign(d,1);
        AbstractExpression expression = new Minus(a,new Plus(new Minus(b,c),d));
        int interpret = expression.interpret(context);
        System.out.println(expression);
        System.out.println(interpret);
    }
}
