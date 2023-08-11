package com.kuo.designPatterns.structural.combination;

/**
 * MenuCompoent
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/11
 * @description 菜单组件，抽象根节点
 */
public abstract class MenuComponent {
    // 菜单组件名称
    protected String name;
    // 层级
    protected int level;

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    // 获取指定的子菜单
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    // 获取菜单或者菜单项名称
    public String getName(){
        return this.name;
    }

    // 打印菜单名称的方法（包含子菜单和子菜单项）
    public abstract void print();
}
