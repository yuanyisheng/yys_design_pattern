package com.yys.pattern.proxy.staticproxy;

import com.yys.pattern.proxy.BaseMeiPo;
import com.yys.pattern.proxy.Person;

/**
 * 静态代理
 *      媒婆 <代理对象>
 * @author yys
 * @date 2019.12.12
 */
public class MeiPoProxy extends BaseMeiPo implements Person {

    private Person target;

    public MeiPoProxy(Person target) {
        this.target = target;
    }

    public void findLove() {
        before();
        target.findLove();
        after();
    }

}
