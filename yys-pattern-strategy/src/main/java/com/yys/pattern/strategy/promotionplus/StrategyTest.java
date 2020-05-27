package com.yys.pattern.strategy.promotionplus;

import org.apache.commons.lang3.StringUtils;

/**
 * 策略模式
 *      Test
 * @author yys
 */
public class StrategyTest {

//    public static void main(String[] args) {
//
//        PromotionActivity couponActivity = new PromotionActivity(new CouponStrategy());
//        PromotionActivity cashbackActivity = new PromotionActivity(new CashbackStrategy());
//
//        couponActivity.execute();
//        cashbackActivity.execute();
//
//    }

    // 此种场景在实际开发中并不实用
    // 我们做活动时候往往是要根据不同的需求对促销策略进行动态选择的
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String promotionKey = "COUPON";
//        if (StringUtils.equals(promotionKey, "COUPON")) {
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        } else if (StringUtils.equals(promotionKey, "CASHBACK")) {
//            promotionActivity = new PromotionActivity(new CashbackStrategy());
//        }
//        promotionActivity.execute();
//    }

    // 上述简单改造，在我们的促销活动越来越多，每次迭代需要改代码，判断逻辑可能也变得 越来越复杂
    // 我们可以结合单例模式和工厂模式来重构代码
    public static void main(String[] args) {
        String prtomionKey = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(prtomionKey));
        promotionActivity.execute();
    }


}
