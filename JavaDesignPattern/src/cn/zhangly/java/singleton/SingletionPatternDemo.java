package cn.zhangly.java.singleton;

/**
 * Created by zhangly on 17-6-16.
 */
public class SingletionPatternDemo {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }

}
