package com.freemud.test.singleton;


/**
 * Created by junjie.li on 2017/9/22.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
