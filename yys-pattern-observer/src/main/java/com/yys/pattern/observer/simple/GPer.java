package com.yys.pattern.observer.simple;

import lombok.Getter;

import java.util.Observable;

/**
 * 观察者模式
 *      JDK 提供的一种观察者的实现方式，被观察者
 * @author yys
 */
@Getter
public class GPer extends Observable {

    private final String name = "GPer生态圈";
    private volatile static GPer gPer = null;

    public GPer() {
    }

    public static GPer getInstance() {
        if(null == gPer) {
            synchronized (GPer.class) {
                if(null == gPer) {
                    gPer = new GPer();
                }
            }
        }
        return gPer;
    }

    // 提问题方法
    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "提交了一个问题");

        // 钩子方法，设置为true
        setChanged();
        // 循环观察者(这里指teacher)并调用update(this<这里指被观察者(GPer)>, arg<这里指问题>)
        notifyObservers(question);

    }

}
