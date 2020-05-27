package com.yys.pattern.strategy.promotionplus;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式
 *      促销策略工厂
 * @author yys
 */
public class PromotionStrategyFactory {

    private PromotionStrategyFactory() {

    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>() {{
        put(PromotionKey.COUPON.getDescription(), PromotionKey.COUPON.getPromotionStrategy());
        put(PromotionKey.CASHBACK.getDescription(), PromotionKey.CASHBACK.getPromotionStrategy());
        put(PromotionKey.GROUPBUY.getDescription(), PromotionKey.GROUPBUY.getPromotionStrategy());
    }};

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    @Getter
    public enum PromotionKey {
        COUPON("COUPON", new CouponStrategy()),
        CASHBACK("CASHBACK", new CashbackStrategy()),
        GROUPBUY("GROUPBUY", new GroupbuyStrategy());

        public final String description;
        public final PromotionStrategy promotionStrategy;

        PromotionKey(String description, PromotionStrategy promotionStrategy) {
            this.description = description;
            this.promotionStrategy = promotionStrategy;
        }
    }

}
