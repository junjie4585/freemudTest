package com.freemud.test.builder;


import com.freemud.test.abstractFactory.Sender;

import java.util.List;

/**
 * Created by junjie.li on 2017/9/22.
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
        List<Sender> senderList = builder.getList();
        senderList.forEach(sender ->{
            sender.Send();
        });

    }
}
