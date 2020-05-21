package com.yys.pattern.factory.abstractfactory;


/**
 * 星辰变功法工厂
 * @author yys
 */
public class XingChenBianArtsFactory extends IMartialArtsFactory {

    public IArtsImprove createArtsImprove() {
        return new XingChenBianArtsImprove();
    }

    public IArtsPractice createArtsPractice() {
        return new XingChenBianArtsPractice();
    }
}
