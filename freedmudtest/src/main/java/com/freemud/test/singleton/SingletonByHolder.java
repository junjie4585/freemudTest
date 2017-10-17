package com.freemud.test.singleton;

/**
 * Created by junjie.li on 2017/9/22.
 *
 *
 * 用抽象类解决了反射攻击
 * 用类加载的线程安全性解决了并发
 * 用内部类实现了lazyloader的目的
 * 没有实现clone
 * 没有实现Serializable接口不会有反序列化的问题
 */
public class SingletonByHolder {
    private static class SingletonHolder{
        private static final SingletonByHolder INSTANCE = new SingletonByHolder(){};
    }

    private SingletonByHolder() {
    }

    public static SingletonByHolder getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
