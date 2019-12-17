package com.yys.pattern.factory.facotymethod;

import com.yys.pattern.factory.IMartialArts;
import com.yys.pattern.factory.XingChenBianArts;

/**
 * 功法秘籍-星辰变功法工厂
 * @author yys
 */
public class XingChenBianArtsFactory implements IMartialArtsFactory {

    public IMartialArts create() {
        return new XingChenBianArts();
    }

}
