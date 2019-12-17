package com.yys.pattern.factory.abstractfactory;


/**
 * 星辰变功法 - 抽象工厂
 * @author yys
 */
public class XingChenBianArtsFactory implements IMartialArtsFactory {

    public ICreateArts createCreateArts() {
        return new XingChenBianArtsCreate();
    }

    public IXiuLianArts createXiuLianArts() {
        return new XingChenBianArtsXiuLian();
    }
}
