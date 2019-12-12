package com.yys.pattern.proxy.dynamicproxy.jdkproxy;

import com.yys.pattern.proxy.Person;

public class ProxyTest {

    /**
     * (JDK方式)结论：
     *      1、目标对象需实现接口
     */
    public static void main(String[] args) {

        // 创建目标对象
        // Person target = new GirlSingleDog();
        Person target = new BoySingleDog();
        // 创建代理对象
        Person proxy = (Person) new JDKMeiPoProxy().getInstance(target);

        proxy.findLove();
    }

}
