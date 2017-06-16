package cn.zhangly.java.builder;

/**
 * Created by zhangly on 17-6-16.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
