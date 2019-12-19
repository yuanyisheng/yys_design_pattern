package com.yys.pattern.singleton.lazy;

/**
 * 单例：懒汉式(双重检查锁)
 *
 *      1、加载时序：在外部类使用时才进行实例化
 *
 *      2、线程安全问题：线程安全，synchronized同步代码块
 *
 *      3、优点：
 *          a.在外部类使用时才进行实例化，在节省内存空间来说，比饿汉式好
 *
 *      4、缺点：
 *          a.(性能较高) 因本质为同步代码块，较同步方法的方式来说，性能大幅度提升
 *
 * @author yys
 */
public class LazyDoubleCheckSingleton {

    // 私有构造，防止外界new对象
    private LazyDoubleCheckSingleton() {

    }

    // volatile：保证可见性和禁止指令重排序
    private volatile static LazyDoubleCheckSingleton lazy;

    public static LazyDoubleCheckSingleton getInstance() {
        // 第一重检查锁
        if(null == lazy) {
            synchronized (LazyDoubleCheckSingleton.class) {
                // 第二重检查锁
                if(null == lazy) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }

    // 为什么需要volatile：防止JVM指令重排序

    // 创建对象的顺序：
    // 1、分配空间
    // 2、初始化对象
    // 3、设置对象指向刚分配的内存地址

    /**
     * 为什么需要加volatile才可以？
     * 因为：
     * 1、先说下new Object()在底层是几步骤
     *      1.memory=allocate()分配对象的内存空间。
     *      2.createInstance()初始化对象
     *      3.instance=memory 设置instance指向刚分配的内存
     * 2、再说下为什么需要volatile
     *      因为JVM指令重排序。
     *      若3.和2.被重排序换位置了，那结果是先分配内存空间，然后指向，最后初始化对象。那么
     *      我们这时候虽然是有synchronize，但是两次进入都发现没有初始化对象，因为他指向内存
     *      分配的空间了，尚未初始化对象。
     */

}
