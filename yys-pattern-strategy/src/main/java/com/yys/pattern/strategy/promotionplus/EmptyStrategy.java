package com.yys.pattern.strategy.promotionplus;

/**
 * 策略模式
 *      无优惠
 * @author yys
 */
public class EmptyStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("无促销活动");
    }

}
