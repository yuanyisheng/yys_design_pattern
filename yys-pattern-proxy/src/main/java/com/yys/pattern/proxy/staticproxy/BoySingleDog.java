package com.yys.pattern.proxy.staticproxy;

import com.yys.pattern.proxy.Person;

/**
 * 静态代理
 *      男单身狗 <目标对象>
 * @author yys
 * @date 2019.12.12
 */
public class BoySingleDog implements Person {

    public void findLove() {
        System.out.println("男单身狗：要求不高，白富美！");
    }

}
