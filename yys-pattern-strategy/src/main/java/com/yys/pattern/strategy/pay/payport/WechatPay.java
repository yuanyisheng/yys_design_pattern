package com.yys.pattern.strategy.pay.payport;

/**
 * 策略模式
 *      微信支付
 * @author yys
 */
public class WechatPay extends Payment {

    public String getName() {
        return "微信";
    }

    protected double queryBalance(String uid) {
        return 250;
    }

}
