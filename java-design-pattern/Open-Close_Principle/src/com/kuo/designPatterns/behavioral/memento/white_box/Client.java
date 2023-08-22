package com.kuo.designPatterns.behavioral.memento.white_box;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/22
 * @description 白箱备忘录
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----------------------大战boss前-----------------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());
        System.out.println("----------------------大战boss后-----------------------");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("----------------------恢复之前-----------------------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
