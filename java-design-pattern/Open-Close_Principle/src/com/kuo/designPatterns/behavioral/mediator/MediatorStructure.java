package com.kuo.designPatterns.behavioral.mediator;

/**
 * MediatorStructure
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/19
 * @description 具体的中介者角色类
 */
public class MediatorStructure extends Mediator{
    // 聚合房主和租房者对象
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
