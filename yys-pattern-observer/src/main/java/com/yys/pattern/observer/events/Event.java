package com.yys.pattern.observer.events;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Method;

/**
 * 观察者模式
 *      监听器的一种包装,标准事件源格式的定义
 * @author yys
 */
@Getter
@Setter
public class Event {

    // 事件源，事件是由谁发起的并保存起来
    private Object source;
    // 事件触发，要通知谁
    private Object target;
    // 事件触发，要做什么动作，回调方法
    private Method callback;
    // 事件名称，触发的是什么事件
    private String trigger;
    // 事件触发的时间
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    @Override
    public String toString() {
        return "Event{" + "\n" +
                "\tsource=" + source.getClass() + ",\n" +
                "\ttarget=" + target.getClass() + ",\n" +
                "\tcallback=" + callback + ",\n" +
                "\ttrigger='" + trigger + "',\n" +
                "\ttime=" + time + "'\n" +
                '}';
    }

}
