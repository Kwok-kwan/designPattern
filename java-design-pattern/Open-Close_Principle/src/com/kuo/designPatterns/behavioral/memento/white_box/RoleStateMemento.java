package com.kuo.designPatterns.behavioral.memento.white_box;

/**
 * RoleStateMemento
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/22
 * @description 备忘录
 */
public class RoleStateMemento {
    private int vit;
    private int atk;
    private int def;

    public RoleStateMemento() {
    }

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }



    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
