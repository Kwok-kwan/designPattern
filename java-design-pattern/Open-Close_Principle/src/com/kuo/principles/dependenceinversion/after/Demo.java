package com.kuo.principles.dependenceinversion.after;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/21 21:38
 */
public class Demo {
    public static void main(String[] args) {
        HardDisk xiJieHardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setHardDisk(xiJieHardDisk);
        computer.setMemory(memory);
        computer.run();
    }
}
