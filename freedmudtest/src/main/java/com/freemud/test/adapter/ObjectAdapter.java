package com.freemud.test.adapter;

/**
 * Created by junjie.li on 2017/10/16.
 *
 * 对象适配器：
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，不再继承Source类，而是持有Source类的实例。
 */
public class ObjectAdapter implements Targetable{
    Source source;

    public ObjectAdapter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();

    }

    @Override
    public void method2() {
        System.out.println("this is method2");
    }

    public static void main(String[] args) {
        Targetable targetable = new ObjectAdapter(new Source());
        targetable.method1();
        targetable.method2();
    }
}
