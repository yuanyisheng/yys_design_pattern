package com.yys.pattern.strategy.pay;

import com.yys.pattern.strategy.pay.payport.PayStrategy;

/**
 * 策略模式
 *      Test
 * @author yys
 */
public class StrategyTest {

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
