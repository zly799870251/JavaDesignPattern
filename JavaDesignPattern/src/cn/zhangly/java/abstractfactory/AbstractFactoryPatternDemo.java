package cn.zhangly.java.abstractfactory;

import cn.zhangly.java.factory.Circle;
import cn.zhangly.java.factory.Rectangle;
import cn.zhangly.java.factory.Shape;
import cn.zhangly.java.factory.Square;

/**
 * Created by zhangly on 17-6-15.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(Shape.class.getSimpleName());
        AbstractFactory colorFactory = FactoryProducer.getFactory(Color.class.getSimpleName());

        Shape rectangle = shapeFactory.getShape(Rectangle.class.getSimpleName());
        rectangle.draw();

        Shape square = shapeFactory.getShape(Square.class.getSimpleName());
        square.draw();

        Shape circle = shapeFactory.getShape(Circle.class.getSimpleName());
        circle.draw();

        Color red = colorFactory.getColor(Red.class.getSimpleName());
        red.fill();

        Color green = colorFactory.getColor(Green.class.getSimpleName());
        green.fill();

        Color blue = colorFactory.getColor(Blue.class.getSimpleName());
        blue.fill();

        System.out.println("程序执行完毕！");
    }
}
