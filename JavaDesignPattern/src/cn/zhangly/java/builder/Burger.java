package cn.zhangly.java.builder;

/**
 * Created by zhangly on 17-6-16.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
