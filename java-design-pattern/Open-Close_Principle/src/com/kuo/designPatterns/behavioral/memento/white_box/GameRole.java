package com.kuo.designPatterns.behavioral.memento.white_box;

/**
 * GameRole
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/22
 * @description 游戏角色类（发起人角色）
 */
public class GameRole {
    private int vit;
    private int atk;
    private int def;

    // 初始化内部状态
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    // 展示状态功能
    public void stateDisplay(){
        System.out.println("角色生命力："+vit);
        System.out.println("角色攻击力："+atk);
        System.out.println("角色防御力："+def);
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoverState(RoleStateMemento roleStateMemento) {
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
        this.vit = roleStateMemento.getVit();
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
