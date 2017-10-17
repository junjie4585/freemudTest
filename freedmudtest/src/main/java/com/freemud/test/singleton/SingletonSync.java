package com.freemud.test.singleton;

/**
 * Created by junjie.li on 2017/9/22.
 * 会被反射攻击
 */
public class SingletonSync {
    private static SingletonSync instance = null;

    private SingletonSync() {
    }
    public static SingletonSync getInstance(){
        if (null == instance){ //如果没有 这里 的检查，那么所有的getInstance()都会进入锁争夺，会影响性能，因此加入了检查
            synchronized (SingletonSync.class){
                if (null == instance){
                    instance = new SingletonSync();
                }
            }
        }
        return instance;
    }
}
