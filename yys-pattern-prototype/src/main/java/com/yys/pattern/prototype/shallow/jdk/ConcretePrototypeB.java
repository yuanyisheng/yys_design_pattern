package com.yys.pattern.prototype.shallow.jdk;

import java.util.List;

/**
 * 原型对象(被克隆对象)
 *
 *      JDK自带实现方式
 *
 * @author yys
 */
public class ConcretePrototypeB implements Cloneable{

    private String name;

    private int age;

    private List hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }


    // 重写克隆方法
    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
