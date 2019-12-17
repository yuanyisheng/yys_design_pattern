package com.yys.pattern.factory.simplefactory;

import com.yys.pattern.factory.IMartialArts;

/**
 * 功法秘籍简单工厂
 * @author yys
 */
public class MartialArtsFactory {

    public IMartialArts create(Class<? extends IMartialArts> clazz) {
        if(null != clazz) {
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
