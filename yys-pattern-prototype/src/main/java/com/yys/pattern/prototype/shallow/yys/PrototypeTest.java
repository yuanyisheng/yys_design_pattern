package com.yys.pattern.prototype.shallow.yys;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅克隆
 *      Test
 * @author yys
 */
public class PrototypeTest {

    public static void main(String[] args) {

        // 创建被克隆对象
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setName("yys");
        concretePrototype.setAge(18);
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("挑灯写博客");
        concretePrototype.setHobbies(hobbies);
        System.out.println("被克隆对象：" + concretePrototype);
        // 输出对象地址：底层代码如下输出形式
//        System.out.println(concretePrototype.getClass().getName() + "@" + Integer.toHexString(concretePrototype.hashCode()));


        // 创建Client对象，准备开始克隆
        Client client = new Client(concretePrototype);
        ConcretePrototypeA cloneConcretePrototype = (ConcretePrototypeA) client.startClone();
        System.out.println("克隆对象：" + cloneConcretePrototype);
//        System.out.println(cloneConcretePrototype.getClass().getName() + "@" + Integer.toHexString(cloneConcretePrototype.hashCode()));

        System.out.println("被克隆对象中的引用类型地址值：" + concretePrototype.getHobbies());
        System.out.println("克隆对象中的引用类型地址值：" + cloneConcretePrototype.getHobbies());
        System.out.println("被克隆对象引用类型地址值 compare 克隆对象引用类型地址值：" + (concretePrototype.getHobbies() == cloneConcretePrototype.getHobbies()));
        System.out.println("引用类型地址相同 --> 修改任意克隆对象的 hobbies值，所有克隆对象 hobbies值 都会改变 --> 浅克隆");

    }

}
