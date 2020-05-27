package com.yys.pattern.delegate.simple;

/**
 * 委派模式
 *      老板
 * @author yys
 */
public class Boss {

    // 老板给经理下达任务
    public void doing(String command, Leader leader) {
        leader.doing(command);
    }

}
