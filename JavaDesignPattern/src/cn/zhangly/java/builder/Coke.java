package cn.zhangly.java.builder;

/**
 * Created by zhangly on 17-6-16.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
