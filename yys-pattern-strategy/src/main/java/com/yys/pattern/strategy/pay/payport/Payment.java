package com.yys.pattern.strategy.pay.payport;

import com.yys.pattern.strategy.pay.PayState;

/**
 * 策略模式
 *      支付渠道
 * @author yys
 */
public abstract class Payment {

    // 支付类型
    public abstract String getName();

    // 查询余额
    protected abstract double queryBalance(String uid);

    // 扣款支付
    public PayState pay(String uid, double amount) {
        if(queryBalance(uid) < amount) {
            return new PayState(500, "支付失败", "余额不足");
        }
        return new PayState(200, "支付成功", "支付金额" + amount);
    }

}
