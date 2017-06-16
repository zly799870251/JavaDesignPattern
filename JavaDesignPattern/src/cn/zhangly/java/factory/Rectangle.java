package cn.zhangly.java.factory;

/**
 * Created by zhangly on 17-6-15.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle :: draw() method.");
    }

}
