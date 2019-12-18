package com.yys.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例：登记式(容器式)
 *
 *      将每一个实例都缓存到统一的容器中，使用唯一标识获取实例
 *
 * @author yys
 */
public class ContainerSingleton {

    // 私有构造，防止外界new对象
    private ContainerSingleton() {

    }

    // spring中的做法，注册时单例
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if(!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);
        }
    }

    /**
     * 记录: spring ioc 容器位置 - jdk1.8
     *      org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory
     *
     *      159行
     *      private final ConcurrentMap<String, BeanWrapper> factoryBeanInstanceCache = new ConcurrentHashMap<>();
     */

}
