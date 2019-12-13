package com.yys.pattern.proxy.dynamicproxy.yysproxy;

import java.lang.reflect.Method;

public interface YYSInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
