package com.yys.pattern.proxy.dynamicproxy.cglibproxy;

public class ProxyTest {

    /**
     * (CGlib方式)结论：
     *      1、目标对象不实现接口
     *      2、static final 修饰的方法 -> proxy fail
     */
    public static void main(String[] args) {

        // 创建目标对象
        // BoySingleDog target = new BoySingleDog();
        GirlSingleDog target = new GirlSingleDog();

        // 创建代理对象
        // BoySingleDog proxy = (BoySingleDog) new CGlibMeiPoProxy().getInstance(target.getClass());
        GirlSingleDog proxy = (GirlSingleDog) new CGlibMeiPoProxy().getInstance(target.getClass());

        proxy.findLove();
    }

}
