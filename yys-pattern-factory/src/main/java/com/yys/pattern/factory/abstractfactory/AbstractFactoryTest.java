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

        IMartialArtsFactory factory = new XingChenBianArtsFactory();
        ICreateArts createArts = factory.createCreateArts();
        createArts.improve();
        IXiuLianArts xiuLianArts = factory.createXiuLianArts();
        xiuLianArts.practice();

    }

}
