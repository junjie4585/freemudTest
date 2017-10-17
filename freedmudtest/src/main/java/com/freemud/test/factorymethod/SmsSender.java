package com.freemud.test.factorymethod;

/**
 * Created by junjie.li on 2017/9/19.
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("短信");
    }
}
