package com.freemud.test.factorymethod;


/**
 * Created by junjie.li on 2017/9/19.
 *
 *
 *
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 *
 */
public class SenderFactory {
    public Sender product(String type){
        if (type.equalsIgnoreCase("mail")){
            return new MailSender();
        }else if (type.equalsIgnoreCase("sms")){
            return new SmsSender();
        }else {
            System.out.println("请输入正确的类型");
            return null;
        }

    }

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.product("SMS");
        sender.send();
    }
}
