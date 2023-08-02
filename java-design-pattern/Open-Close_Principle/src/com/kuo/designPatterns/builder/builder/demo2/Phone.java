package com.kuo.designPatterns.builder.builder.demo2;

/**
 * Phone
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/2
 * @description 手机类
 */
public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;
        public Builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder screen(String screen){
            this.screen=screen;
            return this;
        }
        public Builder memory(String memory){
            this.cpu=memory;
            return this;
        }
        public Builder mainBoard(String mainBoard){
            this.mainBoard=mainBoard;
            return this;
        }
        public Phone build(){
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }
}
