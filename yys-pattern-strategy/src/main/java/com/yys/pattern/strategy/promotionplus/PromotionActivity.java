package com.yys.pattern.strategy.promotionplus;

/**
 * 策略模式
 *      优惠活动
 * @author yys
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        promotionStrategy.doPromotion();
    }

}
