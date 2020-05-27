package com.yys.pattern.delegate.simple;

/**
 * 委派模式
 *      员工B
 * @author yys
 */
public class EmployeeB implements IEmployee {

    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "工作");
    }

}
