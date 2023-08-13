package com.kuo.designPatterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

/**
 * Order
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 订单类
 */
public class Order {
    private int diningTable;
    private Map<String ,Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name,int number) {
        this.foodDir.put(name,number);
    }
}
