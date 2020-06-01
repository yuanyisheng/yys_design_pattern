package com.yys.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 观察者模式
 *
 * @author yys
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {

        System.out.println("执行 subscribe 方法,传入的参数是:" + str);

    }

}
