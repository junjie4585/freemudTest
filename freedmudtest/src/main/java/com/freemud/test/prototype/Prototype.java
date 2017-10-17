package com.freemud.test.prototype;

import java.io.*;

/**
 * Created by junjie.li on 2017/10/10.
 */
/*public class Prototype implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}*/

public class Prototype implements Cloneable,Serializable {

    private static final long serialVersionUID = 7901451685761457778L;
    private String name;
    private SerializableObject serializableObject;

    /**
     * 浅复制
     * 将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型指向的还是原对象所指向的
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 深复制
     * 将一个对象复制后，不论是基本数据类型还是引用类型，都是重新创建。简单来说，深复制进行了完全彻底的复制，浅复制不彻底。
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        return objectInputStream.readObject();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SerializableObject getSerializableObject() {
        return serializableObject;
    }

    public void setSerializableObject(SerializableObject serializableObject) {
        this.serializableObject = serializableObject;
    }
}
class SerializableObject implements Serializable{
    private static final long serialVersionUID = -8932035761234642678L;
}
