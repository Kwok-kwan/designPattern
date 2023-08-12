package com.kuo.designPatterns.structural.fly_weight;

/**
 * IBox
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/12
 * @description O图形 具体享元角色
 */
public class OBox extends AbstractBox{
    @Override
    public String getShape() {
        return "O";
    }
}
