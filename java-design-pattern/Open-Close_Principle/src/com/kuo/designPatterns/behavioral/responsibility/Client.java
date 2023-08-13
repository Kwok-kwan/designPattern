package com.kuo.designPatterns.behavioral.responsibility;

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
        LeaveRequest leave1 = new LeaveRequest("小明",1,"身体不适！");
        GroupLeader groupLeader = new GroupLeader();
        ManagerLeader managerLeader = new ManagerLeader();
        GeneralLeader generalLeader = new GeneralLeader();
        groupLeader.setNextHandler(managerLeader);
        managerLeader.setNextHandler(generalLeader);
        groupLeader.submit(leave1);
    }
}
