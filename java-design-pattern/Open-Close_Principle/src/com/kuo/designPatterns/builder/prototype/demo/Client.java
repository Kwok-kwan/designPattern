package com.kuo.designPatterns.builder.prototype.demo;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/31
 * @description TODO
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println("原型对象和克隆出来的是否是同一个对象？"+(realizeType == clone));
    }
}
