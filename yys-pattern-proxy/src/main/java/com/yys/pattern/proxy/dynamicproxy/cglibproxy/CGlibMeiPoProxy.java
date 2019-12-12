package com.yys.pattern.proxy.dynamicproxy.cglibproxy;

import com.yys.pattern.proxy.BaseMeiPo;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 动态代理(CGlib实现方式)
 *      媒婆 <代理对象>
 * @author yys
 * @date 2019.12.12
 */
public class CGlibMeiPoProxy extends BaseMeiPo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        // 相当于Proxy,代理的工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类(目标对象)
        enhancer.setSuperclass(clazz);
        // 设置回调函数，设置方法拦截器
        enhancer.setCallback(this);
        // 创建子类(代理对象)
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }

    /**
     * 匿名内部类实现方式
     * @return
     */
    /*public Object getInstance(Class<?> clazz) {
        // 相当于Proxy,代理的工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类(目标对象)
        enhancer.setSuperclass(clazz);
        // 设置回调函数，设置方法拦截器
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                before();
                Object obj = methodProxy.invokeSuper(o, objects);
                after();
                return obj;
            }
        });
        // 创建子类(代理对象)
        return enhancer.create();
    }*/

}
