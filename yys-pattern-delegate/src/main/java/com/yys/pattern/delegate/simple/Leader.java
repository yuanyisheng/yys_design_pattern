package com.yys.pattern.delegate.simple;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 委派模式
 *      部门经理
 * @author yys
 */
public class Leader implements IEmployee {

    ConcurrentHashMap<String, IEmployee> targets = new ConcurrentHashMap<String, IEmployee>();

    public Leader() {
        this.targets.put("加密", new EmployeeA());
        this.targets.put("登录", new EmployeeB());
    }

    // 经理自己不干活，只分配任务
    public void doing(String command) {
        targets.get(command).doing(command);
    }

}
