package com.yys.pattern.singleton.lazy;

import com.yys.pattern.singleton.hungry.HungrySingleton;
import com.yys.pattern.singleton.hungry.HungryStaticSingleton;

public class ExectorThread implements Runnable {

    public void run() {

        // Test - LazySimpleSingleton
        HungrySingleton singleton = HungrySingleton.getInstance();

        // Test - LazySimpleSingleton
//        HungryStaticSingleton singleton = HungryStaticSingleton.getInstance();

        // Test - LazySimpleSingleton
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();

        // Test - LazyDoubleCheckSingleton
//        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();

        // Test - LazyInnerClassSingleton
//        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();


        System.out.println(Thread.currentThread().getName() + ":" + singleton);

    }

}
