package com.yys.pattern.factory.abstractfactory;

/**
 * 普通修仙功法 - 抽象工厂
 * @author yys
 */
public class NormalArtsFactory implements IMartialArtsFactory {

    public ICreateArts createCreateArts() {
        return new NormalArtsCreate();
    }

    public IXiuLianArts createXiuLianArts() {
        return new NormalArtsXiuLian();
    }
}
