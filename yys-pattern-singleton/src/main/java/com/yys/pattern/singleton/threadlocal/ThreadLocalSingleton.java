package com.yys.pattern.singleton.threadlocal;

/**
 * 防止序列化破坏单例
 *
 *      ThreadLocal 不能保证其创建的对象是全局唯一，但是能保证在单个线程中是唯一的，天生的线程安全
 *
 * @author yys
 */
public class ThreadLocalSingleton {

    // 私有构造，防止外界new对象
    private ThreadLocalSingleton() {

    }

    private final static ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }

}
