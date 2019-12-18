package com.yys.pattern.singleton.hungry;

/**
 * 单例：饿汉式(静态代码块)
 * @author yys
 */
public class HungryStaticSingleton {

    private final static HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    // 私有构造，防止外界new对象
    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }

}
