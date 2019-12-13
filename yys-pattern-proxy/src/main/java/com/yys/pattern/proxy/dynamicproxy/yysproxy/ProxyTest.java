package com.yys.pattern.proxy.dynamicproxy.yysproxy;

import com.yys.pattern.proxy.Person;
import com.yys.pattern.proxy.dynamicproxy.jdkproxy.BoySingleDog;
import com.yys.pattern.proxy.dynamicproxy.jdkproxy.JDKMeiPoProxy;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class ProxyTest {

    /**
     * (手写实现方式 - 原理为：JDK实现方式)
     */
    public static void main(String[] args) throws Exception {

        // 创建目标对象
        // Person target = new GirlSingleDog();
        Person target = new BoySingleDog();

        // 创建代理对象
        Person proxy = (Person) new YYSMeiPoProxy().getInstance(target);

        // 方法执行
        proxy.findLove();

        // 通过反编译工具查看生成代理类源代码
//        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
//        FileOutputStream fos = new FileOutputStream("E:\\$Proxy0.class");
//        fos.write(bytes);
//        fos.close();

    }

}
