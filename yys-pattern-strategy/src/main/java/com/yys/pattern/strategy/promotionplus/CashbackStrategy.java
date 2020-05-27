package com.yys.pattern.strategy.promotionplus;

/**
 * 策略模式
 *      返现活动
 * @author yys
 */
public class CashbackStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("返现促销，返回的金额转到支付宝账号");
    }

}
