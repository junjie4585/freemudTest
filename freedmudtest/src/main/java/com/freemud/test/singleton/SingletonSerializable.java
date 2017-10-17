package com.freemud.test.singleton;

import java.io.Serializable;

/**
 * Created by junjie.li on 2017/9/22.
 */
public class SingletonSerializable implements Serializable {
    private static class SingletonHodler{
        private static final SingletonSerializable INSTANCE = new SingletonSerializable();
    }

    private SingletonSerializable() {
    }
    public static SingletonSerializable getInstance(){
        return SingletonHodler.INSTANCE;
    }
    //方法readResolve， 其返回结果会用来代替反序列化的结果
    public Object readResolve(){
        return SingletonHodler.INSTANCE;
    }
}
