package com.yys.pattern.factory.abstractfactory;

/**
 * 抽象工厂模式
 *      Test
 * @author yys
 */
public class AbstractFactoryTest {

    /*
     * 缺点：
     *      1、规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
     *      2、增加了系统的抽象性和理解难度
     */
    public static void main(String[] args) {

//        // 普通修仙功法
//        IMartialArtsFactory factory = new NormalArtsFactory();
//        IArtsPractice artsPractice = factory.createArtsPractice();
//        artsPractice.practice();
//        IArtsImprove artsImprove = factory.createArtsImprove();
//        artsImprove.improve();

        // 星辰变功法
        IMartialArtsFactory factory = new XingChenBianArtsFactory();
        IArtsPractice artsPractice = factory.createArtsPractice();
        artsPractice.practice(); // 修炼功法
        IArtsImprove artsImprove = factory.createArtsImprove();
        artsImprove.improve(); // 完善创造功法

    }

}
