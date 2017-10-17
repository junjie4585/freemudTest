package com.freemud.test.Decorator;

/**
 * Created by junjie.li on 2017/10/17.
 *
 * 装饰模式：
 *      顾名思义，装饰模式就是给一个对象增加一些新的功能，并且是动态的，要求装饰对象和被装饰对象实现同一接口，装饰对象持有被装饰对象的实例。
 *
 *      Source类是被装饰类，Decorator 是装饰类
 *
 */
interface Sourceable{
    public void method();
}
class Source implements Sourceable{

    @Override
    public void method() {
        System.out.println("this original method");
    }
}
public class Decorator implements Sourceable{

    private Source source;

    public Decorator(Source source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("this is before");
        source.method();
        System.out.println("this is after");
    }


    public static void main(String[] args) {
        Sourceable sourceable = new Decorator(new Source());
        sourceable.method();
    }
}
