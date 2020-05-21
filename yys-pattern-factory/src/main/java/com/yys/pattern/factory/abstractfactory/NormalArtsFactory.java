package com.yys.pattern.factory.abstractfactory;

/**
 * 普通修仙功法工厂
 * @author yys
 */
public class NormalArtsFactory extends IMartialArtsFactory {

    public IArtsImprove createArtsImprove() {
        return new NormalArtsImprove();
    }

    public IArtsPractice createArtsPractice() {
        return new NormalArtsPractice();
    }
}
