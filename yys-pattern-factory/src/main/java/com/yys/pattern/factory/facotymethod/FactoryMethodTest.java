package com.yys.pattern.factory.facotymethod;

import com.yys.pattern.factory.IMartialArts;

/**
 * 工厂方法模式
 *      Test
 * @author yys
 */
public class FactoryMethodTest {

    /*
     * 缺点：
     *      1、类的个数容易过多，增加复杂度
     *      2、增加了系统的抽象性和理解难度
     *
     * 应用场景：
     *      1、创建对象需要大量重复的代码
     *      2、客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
     *      3、一个类通过其子类来指定创建哪个对象
     */
    public static void main(String[] args) {

//        // 星辰变功法工厂
//        IMartialArtsFactory factory = new XingChenBianArtsFactory();
//        IMartialArts martialArts = factory.create();
//        martialArts.practice();


        // 普通修仙功法工厂
        IMartialArtsFactory factory = new NormalArtsFactory();
        IMartialArts martialArts = factory.create();
        martialArts.practice();

    }

}
