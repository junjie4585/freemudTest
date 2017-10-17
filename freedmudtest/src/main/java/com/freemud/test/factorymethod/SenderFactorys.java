package com.freemud.test.factorymethod;

/**
 * Created by junjie.li on 2017/9/19.
 * 多个工厂方法模式:
 *          是对普通工厂方法模式的改进，在普通工厂方法模式中如果传递的字符串出错，则不能正确的创建对象，而多个工厂方法模式是童工多个工厂方法，分别创建对象
 *
 */
public class SenderFactorys {


    public Sender productMail(){
        return new MailSender();
    }

    public Sender productSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        SenderFactorys senderFactorys = new SenderFactorys();
        Sender sender = senderFactorys.productMail();
        sender.send();
        sender = senderFactorys.productSms();
        sender.send();
    }
}
