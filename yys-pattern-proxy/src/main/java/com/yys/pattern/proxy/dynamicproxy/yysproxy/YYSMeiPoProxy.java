package com.yys.pattern.proxy.dynamicproxy.yysproxy;

import com.yys.pattern.proxy.BaseMeiPo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理(手写实现方式)
 *      媒婆 <代理对象>
 * @author yys
 * @date 2019.12.12
 */
public class YYSMeiPoProxy extends BaseMeiPo implements YYSInvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();

        return YYSProxy.newProxyInstance(new YYSClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(target, args);
        after();
        return obj;
    }

    /**
     * 匿名内部类实现
     * @return
     */
    /*public Object getInstance(final Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                before();
                Object obj = method.invoke(target, args);
                after();
                return obj;
            }
        });
    }*/

}
