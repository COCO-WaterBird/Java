package com.msb.test06;

public class Person2 {
    String name;
    int age;
    //command + N
    //构造器的快速添加快捷键:-》构造器-〉选择属性
    public Person2() {
    }
    //按照需要选择参数个数
    public Person2(String name) {
        this.name = name;
    }

    public Person2(int age, String name) {
        this.age = age;
        this.name = name;


    }
}
