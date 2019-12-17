package com.yys.pattern.factory.facotymethod;

import com.yys.pattern.factory.IMartialArts;
import com.yys.pattern.factory.NormalArts;

/**
 * 功法秘籍-普通修仙功法工厂
 * @author yys
 */
public class NormalArtsFactory implements IMartialArtsFactory {

    public IMartialArts create() {
        return new NormalArts();
    }

}
