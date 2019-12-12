package com.yys.pattern.proxy.dynamicproxy.jdkproxy;

import com.yys.pattern.proxy.BaseMeiPo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理(JDK实现方式)
 *      媒婆 <代理对象>
 * @author yys
 * @date 2019.12.12
 */
public class JDKMeiPoProxy extends BaseMeiPo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();

        // 参数1：目标对象使用的类加载器
        // 参数2：目标对象实现的接口/继承的抽象类
        // 参数3：事件处理,执行目标对象的方法时,会触发事件处理器(InvocationHandler)的方法,会把当前执行目标对象的方法作为参数传入
        //       (动态处理器，执行目标对象的方法时,会触发事件处理器的方法)
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
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
