package com.yys.pattern.delegate.simple;

/**
 * 委派模式
 *      员工A
 * @author yys
 */
public class EmployeeA implements IEmployee {

    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干" + command + "工作");
    }

}
