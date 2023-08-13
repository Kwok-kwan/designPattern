package com.kuo.designPatterns.behavioral.command;

/**
 * SeniorChef
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 厨师类
 */
public class SeniorChef {
    public void makeFood(String name, int num) {
        System.out.println(num + "份" + name);
    }
}
