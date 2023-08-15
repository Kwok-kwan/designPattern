package com.kuo.designPatterns.behavioral.state.after;

/**
 * LifeState
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/15
 * @description 抽象状态类
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
