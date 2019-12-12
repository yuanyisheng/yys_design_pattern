package com.yys.pattern.proxy.staticproxy;

import com.yys.pattern.proxy.Person;

public class ProxyTest {

    public static void main(String[] args) {

        // 创建目标对象 - 男/女单身狗
        // Person target = new BoySingleDog();
        Person target = new GirlSingleDog();
        // 创建代理对象 - 媒婆
        MeiPoProxy proxy = new MeiPoProxy(target);

        // 择偶
        proxy.findLove();

    }

}
