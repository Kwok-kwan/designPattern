package com.kuo.designPatterns.builder.prototype.demo;

/**
 * RealizeType
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/31
 * @description 浅克隆
 */
public class RealizeType implements Cloneable{
    public RealizeType() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}
