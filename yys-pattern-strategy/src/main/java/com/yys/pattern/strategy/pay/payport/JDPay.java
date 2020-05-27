package com.yys.pattern.strategy.pay.payport;

/**
 * 策略模式
 *      京东白条支付
 * @author yys
 */
public class JDPay extends Payment {

    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }

}
