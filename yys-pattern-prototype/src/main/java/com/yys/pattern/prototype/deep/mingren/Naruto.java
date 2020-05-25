package com.yys.pattern.prototype.deep.mingren;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 深克隆(原型对象)
 *      鸣人类
 * @author yys
 */
@Getter
@Setter
public class Naruto implements Cloneable, Serializable {

    private String name;

    private int age;

    private List ninjutsu; // 忍术集合


    /**
     * 深克隆方法
     * @return
     */
    public Object deepClone() {
        try {

            // write
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // read
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Naruto clone = (Naruto) ois.readObject();

            // close stream
            bos.close();
            oos.close();
            bis.close();
            ois.close();

            // return
            return clone;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 重写克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }

    public Naruto(String name, int age) {
        this.name = name;
        this.age = age;

        // 忍术
        this.ninjutsu = new ArrayList<Object>();
        this.ninjutsu.add("多重影分身");
        this.ninjutsu.add("风遁·螺旋手里剑");
        this.ninjutsu.add("色诱之术...");

    }

}
