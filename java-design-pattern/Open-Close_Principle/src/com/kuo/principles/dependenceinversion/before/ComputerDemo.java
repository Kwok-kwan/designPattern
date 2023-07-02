package com.kuo.principles.dependenceinversion.before;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/21 21:25
 */
public class ComputerDemo {
    public static void main(String[] args) {
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setXiJieHardDisk(hardDisk);
        computer.run();
    }
}
