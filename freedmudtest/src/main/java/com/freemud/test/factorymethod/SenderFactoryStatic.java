package com.freemud.test.factorymethod;

/**
 * Created by junjie.li on 2017/9/19.
 *
 * 静态工厂方法模式：
 *         多个工厂方法模式中的方法，置为静态的，不需要创建实例直接调用即可。
 */
public class SenderFactoryStatic {
    public static Sender productMail(){
        return new MailSender();
    }

    public static Sender productSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        Sender sender = SenderFactoryStatic.productMail();
        sender.send();
        sender = SenderFactoryStatic.productSms();
        sender.send();
    }
}
