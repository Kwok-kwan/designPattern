package com.kuo.designPatterns.behavioral.state.after;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/15
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
