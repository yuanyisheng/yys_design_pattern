package com.yys.pattern.singleton.serialize;

import java.io.*;

public class SerializeSingletonTest {

    public static void main(String[] args) {

        SerializeSingleton s1;
        SerializeSingleton s2 = SerializeSingleton.getInstance();

        FileOutputStream fos;
        try {

            // 序列化
            fos = new FileOutputStream("yys-pattern-singleton\\src\\main\\java\\com\\yys\\pattern\\singleton\\serialize\\SerializeSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            fos.close();

            // 反序列化
            FileInputStream fis = new FileInputStream("yys-pattern-singleton\\src\\main\\java\\com\\yys\\pattern\\singleton\\serialize\\SerializeSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializeSingleton) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("s1：" + s1);
            System.out.println("s2：" + s2);
            System.out.println("s1 compare s2：" + (s1 == s2));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
