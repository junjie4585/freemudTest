package com.freemud.test.abstractFactory;

/**
 * Created by junjie.li on 2017/9/22.
 */
public class Test {
    public static void main(String[] args) {
        IFactory iFactory = new SenderSmsFactory();
        Sender sender = iFactory.produce();
        sender.Send();
    }
}
