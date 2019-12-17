package com.yys.pattern.factory.simplefactory;

import com.yys.pattern.factory.IMartialArts;
import com.yys.pattern.factory.NormalArts;
import com.yys.pattern.factory.XingChenBianArts;

/**
 * 简单(静态)工厂模式
 *      Test
 * @author yys
 */
public class SimpleFactoryTest {

    /*
     * 缺点：
     *      1、工厂类的职责相对过重，不易于扩展过于复杂的产品结构
     *
     * 应用场景：
     *      1、适用于工厂类负责创建的对象较少的场景
     */
    public static void main(String[] args) {

        MartialArtsFactory artsFactory = new MartialArtsFactory();
        IMartialArts iMartialArts = artsFactory.create(XingChenBianArts.class);
//        IMartialArts iMartialArts = artsFactory.create(NormalArts.class);
        iMartialArts.practice();
    }

}
