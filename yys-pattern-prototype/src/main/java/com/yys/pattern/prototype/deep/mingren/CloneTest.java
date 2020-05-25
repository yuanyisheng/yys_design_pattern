package com.yys.pattern.prototype.deep.mingren;

/**
 * 深克隆
 *      Test
 * @author yys
 */
public class CloneTest {

    public static void main(String[] args) {
        try {

            // 创建原型对象
            Naruto naruto = new Naruto("漩涡鸣人", 16);
            System.out.println("原型对象：" + naruto);

            // 开始克隆 - 深克隆
            Naruto cloneNaruto = (Naruto) naruto.clone();
            System.out.println("克隆对象：" + cloneNaruto);

            // clone start compare
            System.out.println("\n原型对象中的引用类型值：" + naruto.getNinjutsu());
            System.out.println("克隆对象中的引用类型值：" + cloneNaruto.getNinjutsu());
            System.out.println("原型对象引用类型地址值 compare 克隆对象引用类型地址值：" + (naruto.getNinjutsu() == cloneNaruto.getNinjutsu()));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
