package com.kuo.principles.openClose;

/**
 * @Author GuoKunKun
 * @Description 搜狗输入法
 * @Date 2023/5/20 16:55
 */
public class SouGouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    public void display(){
        skin.display();
    }
}
