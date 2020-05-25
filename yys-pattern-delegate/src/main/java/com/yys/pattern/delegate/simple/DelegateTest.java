package com.yys.pattern.delegate.simple;

/**
 * 策略模式
 *      Test
 *
 *      spring中：DispatcherServlet典型的委派模式
 *
 * @author yys
 */
public class DelegateTest {

    // 委派模式（Delegate Pattern）：不属于 GOF23 种设计模式中，基本作用就是 负责任务的调用和分配任务，跟代理模式很像，
    //                              可以看做是一种特殊情况下的静态代理 的全权代理，但是代理模式注重过程，而委派模式注重结果

    public static void main(String[] args) {

        // 客户请求(Boss)，委派者（Leader），被委派者（Target）
        // 委派者要持有被委派者的引用
        // 代理模式注重的是过程，委派模式注重的是结果
        // 策略模式注重的是可扩展（外部扩展），委派模式注重的是内部的灵活和复用
        // 委派模式的核心：分发、调度、派遣
        // 委派模式：就是静态代理和策略模式一种特殊的组合

        new Boss().doing("加密", new Leader());

    }

}
