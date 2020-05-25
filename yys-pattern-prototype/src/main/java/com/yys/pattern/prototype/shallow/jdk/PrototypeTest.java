package com.yys.pattern.prototype.shallow.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅克隆(JDK自带实现方式)
 *      Test
 * @author yys
 */
public class PrototypeTest {

    public static void main(String[] args) {

        // 创建被克隆对象
//        ConcretePrototypeC concretePrototype = new ConcretePrototypeC();
        ConcretePrototypeB concretePrototype = new ConcretePrototypeB();
        concretePrototype.setName("yys");
        concretePrototype.setAge(18);
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("挑灯写博客");
        concretePrototype.setHobbies(hobbies);
        System.out.println("被克隆对象：" + concretePrototype);

        // 开始克隆 -> 创建克隆对象
//        ConcretePrototypeC cloneConcretePrototype = (ConcretePrototypeC) concretePrototype.clone();
        ConcretePrototypeB cloneConcretePrototype = (ConcretePrototypeB) concretePrototype.clone();
        System.out.println("克隆对象：" + cloneConcretePrototype);

        // start compare
        System.out.println("\n被克隆对象中的引用类型地址值：" + concretePrototype.getHobbies());
        System.out.println("克隆对象中的引用类型地址值：" + cloneConcretePrototype.getHobbies());
        System.out.println("被克隆对象引用类型地址值 compare 克隆对象引用类型地址值：" + (concretePrototype.getHobbies() == cloneConcretePrototype.getHobbies()));
//        System.out.println("引用类型地址相同 --> 修改任意克隆对象的 hobbies值，所有克隆对象 hobbies值 都会改变 --> 浅克隆");

        System.out.println("\n被克隆对象中的引用类型地址值：" + concretePrototype.getName());
        System.out.println("克隆对象中的引用类型地址值：" + cloneConcretePrototype.getName());
        System.out.println("被克隆对象引用类型地址值 compare 克隆对象引用类型地址值：" + (concretePrototype.getName() == cloneConcretePrototype.getName()));

    }

}
