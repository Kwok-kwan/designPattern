package com.kuo.designPatterns.builder.prototype.test;

/**
 * Citation
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/31
 * @description TODO
 */
public class Citation implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name+"在此学期表现优秀，特发此奖状！");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
