package com.yys.pattern.strategy.pay;

import com.yys.pattern.strategy.pay.payport.PayStrategy;

/**
 * 策略模式
 *      Test
 * @author yys
 */
public class StrategyTest {

//    策略模式的优缺点
//    优点：
//          1、策略模式符合开闭原则。
//          2、避免使用多重条件转移语句，如 if...else...语句、switch 语句
//          3、使用策略模式可以提高算法的保密性和安全性。
//    缺点： 
//          1、客户端必须知道所有的策略，并且自行决定使用哪一个策略类。
//          2、代码中会产生非常多策略类，增加维护难度

    public static void main(String[] args) {

        // 省略把商品添加到购物车，再从购物车下单
        // 直接从下单开始
//        Order order = new Order("1", "202005270000000001", 999.99);
        Order order = new Order("1", "202005270000000002", 99.99);

        // 开始支付，选择微信/支付宝/京东白条/银联
        // 每个渠道它的支付方式具体算法是不一样的
        // 基本算法固定的
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }

}
