package com.freemud.test.proxy;

/**
 * Created by junjie.li on 2017/10/17.
 */

interface SourceAble{
    public void method();
}
class Source implements SourceAble{

    @Override
    public void method() {
        System.out.println("the original method");
    }
}

public class Proxy implements SourceAble{

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before(){
        System.out.println("this method before");
    }
    private void after(){
        System.out.println("this method after");
    }


    public static void main(String[] args) {
        SourceAble sourceAble = new Proxy();
        sourceAble.method();
    }
}
