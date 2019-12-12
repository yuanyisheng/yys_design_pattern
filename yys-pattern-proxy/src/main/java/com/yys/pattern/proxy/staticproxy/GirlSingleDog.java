package com.yys.pattern.proxy.staticproxy;

import com.yys.pattern.proxy.Person;

/**
 * 静态代理
 *      女单身狗 <目标对象>
 * @author yys
 * @date 2019.12.12
 */
public class GirlSingleDog implements Person {

    public void findLove() {
        System.out.println("女单身狗：有房有车，还要长得帅！");
    }

}
