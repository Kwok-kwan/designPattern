package com.kuo.principles.lawOfDemeter;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/30 15:47
 */
public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Star star = new Star("紫霞");
        agent.setStar(star);
        agent.setFans(new Fans("至尊宝"));
        agent.setCompany(new Company("金信"));
        agent.meeting();
        agent.business();
    }
}
