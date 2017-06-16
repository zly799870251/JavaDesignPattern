package cn.zhangly.java.singleton;

/**
 * Created by zhangly on 17-6-16.
 */
public class SingleObject {

    // 单例无法实例化，只能通过静态方法访问该属性获得该类对象
    private static SingleObject instances = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instances;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
