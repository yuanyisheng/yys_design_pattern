package com.yys.pattern.singleton.lazy;

/**
 * 单例：懒汉式(同步方法)
 *
 *      1、加载时序：在外部类使用时才进行实例化
 *
 *      2、线程安全问题：线程安全，synchronized同步方法
 *
 *      3、优点：
 *          a.在外部类使用时才进行实例化，在节省内存空间来说，比饿汉式好
 *
 *      4、缺点：
 *          a.(性能低) 因本质为同步方法，再线程多的情况下，CPU压力上升，导致大批线程阻塞，导致性能下降
 *
 * @author yys
 */
public class LazySimpleSingleton {

    // 私有构造，防止外界new对象
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazy;

    public synchronized static LazySimpleSingleton getInstance() {
        if(null == lazy) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
