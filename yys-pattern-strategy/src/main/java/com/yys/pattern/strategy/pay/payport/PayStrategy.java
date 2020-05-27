package com.yys.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式
 *      支付策略管理
 * @author yys
 */
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private PayStrategy() {
    }

    private static Map<String, Payment> payStrategy = new HashMap<String, Payment>() {{
        put(ALI_PAY, new AliPay());
        put(JD_PAY, new JDPay());
        put(UNION_PAY, new UnionPay());
        put(WECHAT_PAY, new WechatPay());
    }};

    public static Payment get(String payKey) {
        if(!payStrategy.containsKey(payKey)) {
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }

}
