package com.msb.test06;

public class Test {
    //程序入口
    public static void main(String[] args) {
        //对Person类的对象进行创建,创建了一个person对象,名字叫p1
        Person p1 = new Person();
        //对属性赋值;
        p1.name = "赵姗姗";
        p1.age = 30;
        p1.height = 160.6;
        //对属性读取;
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}
