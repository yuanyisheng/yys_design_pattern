package com.yys.pattern.proxy;

public abstract class BaseMeiPo {

    public void before() {
        System.out.println("\n媒婆：请告诉我您的择偶标准！");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void after() {
        try {
            Thread.sleep(800);
            System.out.print("\n~");
            Thread.sleep(800);
            System.out.print(" ~");
            Thread.sleep(800);
            System.out.println(" ~");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("网络姻缘一线牵，敬请等待你的爱...");
    }

}
