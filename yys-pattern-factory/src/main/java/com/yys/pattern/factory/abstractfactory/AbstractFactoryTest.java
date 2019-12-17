package com.yys.pattern.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        IMartialArtsFactory factory = new XingChenBianArtsFactory();
        ICreateArts createArts = factory.createCreateArts();
        createArts.improve();
        IXiuLianArts xiuLianArts = factory.createXiuLianArts();
        xiuLianArts.practice();

    }

}
