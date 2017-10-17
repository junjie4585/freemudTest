package com.freemud.test.builder;

/**
 * Created by junjie.li on 2017/9/22.
 */


public class BuilderForColumen{
    private int age;
    private int safeId;
    private String name;
    private String address;

    public int getAge() {
        return age;
    }

    public int getSafeId() {
        return safeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static class BuilderColumen {
        private int age = 0;
        private int safeId = 0;
        private String name = "";
        private String address = "";

        public BuilderColumen(String name) {
            this.name = name;
        }
        public BuilderColumen age(int age){
            this.age = age;
            return this;
        }
        public BuilderColumen safeId(int safeId){
            this.safeId = safeId;
            return this;
        }
        public BuilderColumen address(String address){
            this.address = address;
            return this;
        }
        public BuilderForColumen build(){
            return new BuilderForColumen(this);
        }

    }
    public BuilderForColumen(BuilderColumen builderColumen){
        address = builderColumen.address;
        age = builderColumen.age;
        name = builderColumen.name;
        safeId = builderColumen.safeId;
    }

    @Override
    public String toString() {
        return "BuilderForColumen{" +
                "age=" + age +
                ", safeId=" + safeId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        BuilderForColumen builderForColumen = new BuilderColumen("Luna").address("峡谷森林").age(24).safeId(07).build();
        System.out.println(builderForColumen);
    }
}