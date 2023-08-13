package com.kuo.designPatterns.behavioral.responsibility;

/**
 * GroupLeader
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 总经理经理类 具体的处理类
 */
public class GeneralLeader extends Handler {
    public GeneralLeader() {
        super(1, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNum()+"天，"+leave.getContent());
        System.out.println("总经理审批同意！");
    }
}
