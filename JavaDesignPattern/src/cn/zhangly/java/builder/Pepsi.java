package cn.zhangly.java.builder;

/**
 * Created by zhangly on 17-6-16.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
