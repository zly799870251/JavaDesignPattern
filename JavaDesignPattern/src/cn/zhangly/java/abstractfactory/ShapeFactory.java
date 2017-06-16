package cn.zhangly.java.abstractfactory;

import cn.zhangly.java.factory.Circle;
import cn.zhangly.java.factory.Rectangle;
import cn.zhangly.java.factory.Shape;
import cn.zhangly.java.factory.Square;

/**
 * Created by zhangly on 17-6-15.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        return null;
    }
}
