package com.yys.pattern.singleton.serialize;

import java.io.Serializable;

/**
 * 防止序列化破坏单例
 *
 *      增加 readResolve()
 *
 * @author yys
 */
public class SerializeSingleton implements Serializable {

    // 私有构造，防止外界new对象
    private SerializeSingleton() {

    }

    private final static SerializeSingleton INSTANCE = new SerializeSingleton();

    public static SerializeSingleton getInstance() {
        return INSTANCE;
    }

    // 增加此方法，防止序列化破坏单例
    public Object readResolve() {
        return INSTANCE;
    }

    // 序列化
    // 指将内存中的状态通过转换成字节码的形式
    // 从而转换成一个IO流，写入到其他地方(可以是磁盘，网络IO)
    // 内存中状态给永久保存下来了

    // 反序列化
    // 指将已经持久化的字节码内容，转换成IO流
    // 通过IO流的读取，进而将读取的内容转换为java对象
    // 在转换过程中会重新创建对象

}
