package com.freemud.test.singleton;

/**
 * Created by junjie.li on 2017/9/22.
 */
public class SingletonVolatileNoSee {
    private static SingletonVolatileNoSee instance = null;

    private SingletonVolatileNoSee() {
    }

    public static SingletonVolatileNoSee getInstance() {
        if (null == instance){
            synchronized (SingletonVolatileNoSee.class){
                if (null == instance){ //重排序对其他的线程是不可见的
                    SingletonVolatileNoSee singletonVolatileNoSee = new SingletonVolatileNoSee();
                    instance = singletonVolatileNoSee;
                }
            }
        }
        return instance;
    }
}
