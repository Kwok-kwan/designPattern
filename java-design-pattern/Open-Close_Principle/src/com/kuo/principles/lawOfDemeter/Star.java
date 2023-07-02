package com.kuo.principles.lawOfDemeter;

/**
 * @Author GuoKunKun
 * @Description 明星类
 * @Date 2023/5/30 15:42
 */
public class Star {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
