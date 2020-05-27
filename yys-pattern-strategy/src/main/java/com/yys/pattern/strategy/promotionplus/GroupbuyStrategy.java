package com.yys.pattern.strategy.promotionplus;

/**
 * 策略模式
 *      拼团优惠
 * @author yys
 */
public class GroupbuyStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价");
    }

}
