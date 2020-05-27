package com.yys.pattern.strategy.pay.payport;

/**
 * 策略模式
 *      支付宝支付
 * @author yys
 */
public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }

}
