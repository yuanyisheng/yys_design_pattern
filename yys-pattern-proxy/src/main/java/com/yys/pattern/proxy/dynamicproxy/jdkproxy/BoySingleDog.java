package com.yys.pattern.proxy.dynamicproxy.jdkproxy;

import com.yys.pattern.proxy.Person;

/**
 * 动态代理(JDK实现方式)
 *      男单身狗 <目标对象>
 * @author yys
 * @date 2019.12.12
 */
public class BoySingleDog implements Person {

    public void findLove() {
        System.out.println("男单身狗：要求不高，白富美！");
    }

}
