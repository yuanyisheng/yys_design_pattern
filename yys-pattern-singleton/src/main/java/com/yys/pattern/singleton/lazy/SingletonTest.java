package com.yys.pattern.singleton.lazy;

public class SingletonTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(new ExectorThread()).start();
        }

        System.out.println(Thread.currentThread().getName() + "：End...");
    }

}
