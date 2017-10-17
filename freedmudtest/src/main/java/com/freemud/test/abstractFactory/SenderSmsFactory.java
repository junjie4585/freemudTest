package com.freemud.test.abstractFactory;

/**
 * Created by junjie.li on 2017/9/22.
 */
public class SenderSmsFactory implements IFactory{
    public Sender produce() {
        return new SmsSender();
    }
}
