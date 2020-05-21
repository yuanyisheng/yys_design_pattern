package com.yys.pattern.factory.abstractfactory;

/**
 * 功法秘籍抽象工厂
 *  抽象工厂是用户的主入口，在Spring中应用得最为广泛的一种设计模式，易于扩展
 * @author yys
 */
public abstract class IMartialArtsFactory {

    // 创建 功法完善
    abstract IArtsImprove createArtsImprove();

    // 创建 修炼功法
    abstract IArtsPractice createArtsPractice();

}
