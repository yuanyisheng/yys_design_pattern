package com.yys.pattern.proxy.dynamicproxy.jdkproxy;

import com.yys.pattern.proxy.Person;

/**
 * 动态代理(JDK实现方式)
 *      女单身狗 <目标对象>
 * @author yys
 * @date 2019.12.12
 */
public class GirlSingleDog implements Person {

    public void findLove() {
        System.out.println("女单身狗：有房有车，还要长得帅！");
    }

}
