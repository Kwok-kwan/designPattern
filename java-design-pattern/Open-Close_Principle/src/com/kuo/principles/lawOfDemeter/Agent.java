package com.kuo.principles.lawOfDemeter;

/**
 * @Author GuoKunKun
 * @Description 经纪人
 * @Date 2023/5/30 15:44
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    // 和粉丝见面的方法
    public void meeting() {
        System.out.println(star.getName() + "和" + fans.getName() + "见面");
    }

    // 和媒体公司洽谈的方法
    public void business() {
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }
}
