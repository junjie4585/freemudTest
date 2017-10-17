package com.freemud.test.adapter;

/**
 * Created by junjie.li on 2017/10/16.
 *  类适配器
 * 核心思想：
 * 有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 */

class Source{
    public void method1(){
        System.out.println("this is method one");
    }
}
interface Targetable{
    public void method1();

    public void method2();
}

public class ClassAdapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("this is method two");
    }

    public static void main(String[] args) {
        Targetable targetable = new ClassAdapter();
        targetable.method1();
        targetable.method2();
    }
}


