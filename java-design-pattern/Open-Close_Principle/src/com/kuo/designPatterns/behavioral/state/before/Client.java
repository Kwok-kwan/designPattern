package com.kuo.designPatterns.behavioral.state.before;

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
        Lift lift = new Lift();
        lift.setState(ILift.OPENING_STATE);
        lift.open();
    }
}
