package cn.zhangly.java.abstractfactory;

import cn.zhangly.java.factory.Shape;

/**
 * Created by zhangly on 17-6-15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shapeType);
}
