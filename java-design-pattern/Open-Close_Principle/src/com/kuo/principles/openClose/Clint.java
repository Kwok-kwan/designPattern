package com.kuo.principles.openClose;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/20 16:58
 */
public class Clint {
    public static void main(String[] args) {
        // 创建搜狗输入法
        SouGouInput souGouInput = new SouGouInput();
        DefaultSkin defaultSkin = new DefaultSkin();
        KuokSkin kuokSkin = new KuokSkin();
        souGouInput.setSkin(kuokSkin);
        souGouInput.display();
    }
}
