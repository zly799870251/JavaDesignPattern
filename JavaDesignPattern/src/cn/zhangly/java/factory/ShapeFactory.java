package cn.zhangly.java.factory;

/**
 * Created by zhangly on 17-6-15.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
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
