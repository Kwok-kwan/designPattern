package com.kuo.designPatterns.behavioral.state.after;

/**
 * OpeningState
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/15
 * @description 电梯开启状态类
 */
public class OpeningState extends LiftState {
    //开启当然可以关闭了，我就想测试一下电梯门开关功能
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.getLiftState().close();
    }

    //电梯门不能开着就跑，这里什么也不做
    @Override
    public void run() {
        //do nothing
    }

    //开门状态已经是停止的了
    @Override
    public void stop() {
        //do nothing
    }
}
