package cn.zhangly.java.factory;

/**
 * Created by zhangly on 17-6-15.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // if type is rectangle method.
        Shape rectangle = shapeFactory.getShape(Rectangle.class.getSimpleName());
        rectangle.draw();

        // if type is square method.
        Shape square = shapeFactory.getShape(Square.class.getSimpleName());
        square.draw();

        // if type is circle method.
        Shape circle = shapeFactory.getShape(Circle.class.getSimpleName());
        circle.draw();

        System.out.println("程序执行完毕！");
    }

}
