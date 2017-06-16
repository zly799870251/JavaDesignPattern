package cn.zhangly.java.abstractfactory;

/**
 * Created by zhangly on 17-6-15.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue :: fill() method.");
    }
}
