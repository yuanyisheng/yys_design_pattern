package com.yys.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

public class ProxyTest {

    /**
     * (CGlib方式)结论：
     *      1、目标对象不实现接口
     *      2、static final 修饰的方法 -> proxy fail
     */
    public static void main(String[] args) {

        // 利用 cglib 的代理类可以将内存中的class文件写入本地磁盘
        String path = "D:\\java\\yys\\yys-demo\\yys-design-pattern\\yys-pattern-proxy\\src\\main\\java";
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, path);

        // 创建目标对象
        // BoySingleDog target = new BoySingleDog();
        GirlSingleDog target = new GirlSingleDog();

        // 创建代理对象
        // BoySingleDog proxy = (BoySingleDog) new CGlibMeiPoProxy().getInstance(target.getClass());
        GirlSingleDog proxy = (GirlSingleDog) new CGlibMeiPoProxy().getInstance(target.getClass());

        // 方法执行
        proxy.findLove();

    }

}
