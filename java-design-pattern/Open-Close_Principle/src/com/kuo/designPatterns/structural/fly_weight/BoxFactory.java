package com.kuo.designPatterns.structural.fly_weight;

import java.util.HashMap;

/**
 * BoxFactory
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/12
 * @description 工厂类 设计为单例
 */
public class BoxFactory {
    private HashMap<String,AbstractBox> map;

    private static BoxFactory boxFactory = new BoxFactory();
    private BoxFactory(){
        map = new HashMap<String,AbstractBox>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }

    public static BoxFactory getInstance(){
        return boxFactory;
    }
}
