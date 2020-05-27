package com.yys.pattern.strategy.promotion;

/**
 * 策略模式
 *      Test
 * @author yys
 */
public class StrategyTest {

    public static void main(String[] args) {

        PromotionActivity couponActivity = new PromotionActivity(new CouponStrategy());
        PromotionActivity cashbackActivity = new PromotionActivity(new CashbackStrategy());

        couponActivity.execute();
        cashbackActivity.execute();
    }

}
