package com.kuo.designPatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Home
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/21
 * @description 对象结构类
 */
public class Home {
    // 声明集合，存储元素对象
    private List<Animal> nodeList = new ArrayList<>();

    public void add(Animal animal){
        nodeList.add(animal);
    }

    public void action(Person person){
        // 访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }

}
