package com.kuo.designPatterns.behavioral.interpreter;

/**
 * AbstractExpression
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/24
 * @description 抽象表达式类
 */
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}
