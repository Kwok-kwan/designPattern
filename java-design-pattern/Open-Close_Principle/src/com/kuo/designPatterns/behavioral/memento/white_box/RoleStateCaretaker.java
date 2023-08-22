package com.kuo.designPatterns.behavioral.memento.white_box;

/**
 * RoleStateCaretaker
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/22
 * @description 备忘录对象管理类
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
