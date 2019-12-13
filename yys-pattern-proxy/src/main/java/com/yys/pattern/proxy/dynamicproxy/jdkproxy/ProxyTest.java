package com.yys.pattern.proxy.dynamicproxy.jdkproxy;

import com.yys.pattern.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class ProxyTest {

    /**
     * (JDK方式)结论：
     *      1、目标对象需实现接口
     */
    public static void main(String[] args) throws Exception {

        // 创建目标对象
        // Person target = new GirlSingleDog();
        Person target = new BoySingleDog();

        // 创建代理对象
        Person proxy = (Person) new JDKMeiPoProxy().getInstance(target);

        // 方法执行
        proxy.findLove();

        // 通过反编译工具查看生成代理类源代码
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream fos = new FileOutputStream("E:\\$Proxy0.class");
        fos.write(bytes);
        fos.close();

    }

}
