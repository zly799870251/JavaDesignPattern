package cn.zhangly.java.builder;

/**
 * Created by zhangly on 17-6-16.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return this.getClass().getSimpleName();
    }
}
