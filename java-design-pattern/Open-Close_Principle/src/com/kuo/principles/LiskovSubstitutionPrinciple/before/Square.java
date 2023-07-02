package com.kuo.principles.LiskovSubstitutionPrinciple.before;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/20 17:12
 */
public class Square extends Rectangle{


    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }



    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
