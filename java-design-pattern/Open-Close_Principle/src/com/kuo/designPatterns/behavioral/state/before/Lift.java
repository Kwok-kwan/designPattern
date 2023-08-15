package com.kuo.designPatterns.behavioral.state.before;

/**
 * Lift
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/15
 * @description 电梯类
 */
public class Lift implements ILift {
    // 当前电梯状态
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯打开了！");
                this.state = OPENING_STATE;
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void close() {
        switch (state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯打开了！");
                this.state = OPENING_STATE;
                break;
            case RUNNING_STATE:
                break;
        }

    }

    @Override
    public void run() {
        switch (state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯打开了！");
                this.state = OPENING_STATE;
                break;
            case RUNNING_STATE:
                break;
        }

    }

    @Override
    public void stop() {
        switch (state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯打开了！");
                this.state = OPENING_STATE;
                break;
            case RUNNING_STATE:
                break;
        }

    }
}
