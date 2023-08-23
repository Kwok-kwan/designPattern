package com.kuo.designPatterns.behavioral.memento.black_box;

/**
 * RoleStateCaretaker
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/22
 * @description 备忘录对象管理类
 */
public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
