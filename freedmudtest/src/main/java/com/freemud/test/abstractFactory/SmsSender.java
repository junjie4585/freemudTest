package com.freemud.test.abstractFactory;

/**
 * Created by junjie.li on 2017/9/22.
 */
public class SmsSender implements Sender {
    public void Send() {
        System.out.println("this is SMS Send!");
    }
}
