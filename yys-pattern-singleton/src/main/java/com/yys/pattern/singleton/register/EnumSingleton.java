package com.yys.pattern.singleton.register;

/**
 * 单例：登记式(枚举式)
 *
 *      将每一个实例都缓存到统一的容器中，使用唯一标识获取实例
 *      常量中去使用，常量就是用来大家都能够共用，通常在通用API中使用
 *
 * @author yys
 */
public enum  EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
