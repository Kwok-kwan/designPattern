package com.kuo.principles.LiskovSubstitutionPrinciple.after;

/**
 * @Author GuoKunKun
 * @Description 正方形
 * @Date 2023/5/20 17:48
 */
public class Square implements Quadrilateral{


    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
