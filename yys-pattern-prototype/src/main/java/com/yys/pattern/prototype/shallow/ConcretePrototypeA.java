package com.yys.pattern.prototype.shallow;

import java.util.List;

/**
 * 原型对象(被克隆对象)
 * @author yys
 */
public class ConcretePrototypeA implements Prototype {

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

    public Prototype clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setName(this.name);
        concretePrototype.setAge(this.age);
        concretePrototype.setHobbies(this.hobbies);
        return concretePrototype;
    }
}
