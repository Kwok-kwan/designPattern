package com.kuo.designPatterns.behavioral.command;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面",1);
        order1.setFood("小杯可乐",2);
        order2.setDiningTable(2);
        order2.setFood("尖椒肉丝盖饭",1);
        order2.setFood("小杯雪碧",1);
        SeniorChef receiver = new SeniorChef();
        OrderCommand orderCommand1 = new OrderCommand(receiver, order1);
        OrderCommand orderCommand2 = new OrderCommand(receiver, order2);
        Waiter invoke = new Waiter();
        invoke.setCommand(orderCommand1);
        invoke.setCommand(orderCommand2);
        invoke.orderUp();

    }
}
