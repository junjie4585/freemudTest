package com.freemud.test.adapter;

/**
 * Created by junjie.li on 2017/10/16.
 *
 * 有时我们写的一个接口中有多个抽象方法，当我们实现该接口时需要实现该接口的所有方法。这明显是比较浪费的，因为并不是所有的方法都是我们需要的。
 * 引入适配器模式，借助一个抽象类，该抽象类实现接口所有方法，我们继承该抽象类，重新需要的方法。
 */
interface SourceAble{
    public void method1();
    public void method2();
}
abstract class AbstractSource implements SourceAble{
    public void method1(){}
    public void method2(){}
}
class SourceSub1 extends AbstractSource{
    @Override
    public void method2() {
        super.method2();
        System.out.println("this is the method two");
    }
}
class SourceSub2 extends AbstractSource{
    @Override
    public void method1() {
        super.method1();
        System.out.println("this is the method one");
    }
}

public class IntefaceAdapter{
    public static void main(String[] args) {
        SourceAble sub1 = new SourceSub1();
        SourceAble sub2 = new SourceSub2();

        sub1.method1();
        sub1.method2();

        System.out.println("**********************************************");

        sub2.method1();
        sub2.method2();
    }


}
