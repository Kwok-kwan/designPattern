package com.kuo.designPatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Waiter
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 服务员类 请求者角色
 */
public class Waiter {
    // 持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        this.commands.add(command);
    }

    // 发起命令 功能
    public void orderUp(){
        System.out.println("美女服务员：大厨，新订单来了");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
