package com.kuo.designPatterns.behavioral.responsibility;

/**
 * GroupLeader
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 小组长类 具体的处理类
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNum()+"天，"+leave.getContent());
        System.out.println("小组长审批同意！");
    }
}
