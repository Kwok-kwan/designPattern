package com.kuo.designPatterns.behavioral.command;

import java.util.Map;
import java.util.Set;

/**
 * OrderCommand
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 具体的命令类
 */
public class OrderCommand implements Command{
    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    // 持有接收者对象
    private SeniorChef receiver;
    private Order order;
    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"卓的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> keys = foodDir.keySet();
        for (String key : keys) {
            receiver.makeFood(key,foodDir.get(key));
        }
        System.out.println(order.getDiningTable()+"卓的饭准备完毕！");
    }
}
