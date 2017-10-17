package com.freemud.test.singleton;

/**
 * Created by junjie.li on 2017/9/22.\
 * 制止重排序的方式单例
 *
 * volatile关键字。这个关键字的意义在于保证变量的可见性。保证变量的改变肯定会回写主内存，并且关闭java -server模式下的一些优化，比如重排序
 */
public class SingletonNoVolatile {
    private static volatile SingletonNoVolatile instance = null;

    private SingletonNoVolatile() {
    }

    public static SingletonNoVolatile getInstance(){
        if (null == instance){
            synchronized (SingletonNoVolatile.class){
                if (null == instance){
                    instance = new SingletonNoVolatile();
                }
            }
        }
        return instance;
    }
}
