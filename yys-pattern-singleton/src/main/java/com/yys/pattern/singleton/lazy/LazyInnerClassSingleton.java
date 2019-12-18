package com.yys.pattern.singleton.lazy;

/**
 * 单例：懒汉式(静态内部类)
 *
 *      1、加载时序：在外部类使用时静态内部类进行实例化(静态内部类属于饿汉式单例)
 *
 *      2、线程安全问题：线程安全，静态内部类属于饿汉式单例
 *
 *      3、优点：
 *          a.兼顾饿汉式的内存浪费，也兼顾synchronized锁的性能问题
 *
 *      4、缺点：
 *          a.通过反射机制可以破坏单例
 *
 * @author yys
 */
public class LazyInnerClassSingleton {

    // 私有构造，防止外界new对象
    private LazyInnerClassSingleton() {
        // 防止反射破坏单例
        if(LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    // 每一个关键字都不是多余的
    // static 是为了是单例的空间共享
    // final 保证该方法不被重写/重载
    public static final LazyInnerClassSingleton getInstance() {
        // 在返回结果之前，一定会先加载静态内部类
        return LazyHolder.LAZY;
    }

    // 默认不加载，使用LazyInnerClassSingleton时，会先初始化内部类，没使用，则内部类不加载
    private static class LazyHolder {
        private final static LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
