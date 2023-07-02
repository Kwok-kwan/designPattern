package com.kuo.principles.dependenceinversion.before;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/21 21:23
 */
public class Computer {
    private XiJieHardDisk xiJieHardDisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行计算机");
        String s = xiJieHardDisk.get();
        System.out.println("从硬盘上获取的数据："+s);
        cpu.run();
        memory.save();
    }
}
