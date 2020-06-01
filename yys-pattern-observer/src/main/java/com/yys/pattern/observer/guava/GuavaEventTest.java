package com.yys.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * 观察者模式
 *      Test
 * @author yys
 */
public class GuavaEventTest {

    public static void main(String[] args) {

        // create event bug
        EventBus eventBus = new EventBus();

        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("马哥");

    }

}
