package com.freemud.test.builder;

import com.freemud.test.abstractFactory.MailSender;
import com.freemud.test.abstractFactory.Sender;
import com.freemud.test.abstractFactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junjie.li on 2017/9/22.
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

    public List<Sender> getList() {
        return list;
    }
}
