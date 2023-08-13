package com.kuo.designPatterns.behavioral.responsibility;

/**
 * Handler
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 抽象处理者
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 1;
    protected final static int NUM_SEVEN = 1;
    // 该领导处理的处理天数区间
    private int numStart;
    private int numEnd;
    // 后继者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 处理请假条的方法
    protected abstract void handleLeave(LeaveRequest leave);

    // 提交
    public final void  submit(LeaveRequest leave){
        this.handleLeave(leave);
        if (this.nextHandler != null && leave.getNum()> this.numEnd){
            this.nextHandler.submit(leave);
        } else {
            System.out.println("流程结束！");
        }
    }
}
