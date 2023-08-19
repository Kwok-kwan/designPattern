package com.kuo.designPatterns.behavioral.mediator;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/19
 * @description 中介者模式
 */
public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        Tenant tenant = new Tenant("李四", mediator);
        HouseOwner owner = new HouseOwner("张三", mediator);
        mediator.setTenant(tenant);
        mediator.setHouseOwner(owner);

        tenant.contact("我要租房！");
        owner.contact("我有房子！");
    }
}
