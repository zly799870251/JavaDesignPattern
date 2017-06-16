package cn.zhangly.java.abstractfactory;

/**
 * Created by zhangly on 17-6-15.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green :: fill() method.");
    }
}
