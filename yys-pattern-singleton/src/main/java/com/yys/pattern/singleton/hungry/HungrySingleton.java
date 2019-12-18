package com.yys.pattern.singleton.hungry;

/**
 * 单例：饿汉式(静态属性)
 *
 *      1、加载时序：在类加载时就立即初始化并创建单例对象
 *
 *      2、线程安全问题：线程绝对安全，在线程出现前就初始化完成，所以不存在线程安全问题
 *
 *      3、优点：
 *          a.无锁，执行效率高，在用户体验上来说，比懒汉式好
 *
 *      4、缺点：
 *          a.类加载时进行初始化，用或不用都占空间，浪费内存，有可能占着茅坑不拉屎
 *
 * @author yys
 */
public class HungrySingleton {

    // 加载顺序
    // 先静态、后动态 / 先属性、后方法 / 自上而下

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    // 私有构造，防止外界new对象
    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
