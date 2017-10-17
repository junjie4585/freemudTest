package com.freemud.test.singleton;

/**
 * Created by junjie.li on 2017/9/22.
 *
 * 用抽象类解决了反射攻击
 * 用类加载的线程安全性解决了并发
 * 其类加载部分的代码：
 *  public abstract class Enum{
        private Enum{}
        private static Enum INSTANCE = null;
        static{
            INSTANCE = new Enum(){};
        }
    }

 用静态方法初始化保证了线程安全，会在类加载的时候初始化
 没有实现clone
 不会有反序列化的问题， 这个使用javap 仍然没有看到类似于readObject的源代码，应该是jdk内部生成字节码的时候做了某些操作
 */
public enum  SingleEnum {
    INSTANCE;
}
