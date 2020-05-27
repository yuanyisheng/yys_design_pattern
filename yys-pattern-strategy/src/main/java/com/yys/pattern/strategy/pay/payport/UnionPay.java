package com.yys.pattern.strategy.pay.payport;

/**
 * 策略模式
 *      银联支付
 * @author yys
 */
public class UnionPay extends Payment {

    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 150;
    }

}
