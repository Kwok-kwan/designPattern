package com.kuo.designPatterns.behavioral.interpreter;

/**
 * Plus
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/24
 * @description 减法表达式
 */
public class Minus extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "("+left.toString()+"-"+right.toString()+")";
    }
}
