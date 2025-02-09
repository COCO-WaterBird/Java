package com.msb.test01;

public class TestVar {
    public static void main(String[] args) {
        //[1]变量声明
            //定义一个年龄变量
            //定义一个变量,名字叫(标识符),类型是int
        int age;
            //变量不可以重复定义
            // int age;
            //同时可以定义多个变量;
        int a,b;

        //[2]变量的赋值
        age = 18;//等号进行赋值操作
        age = 32;
        age = 40 + 18;
        //变量的定义和赋值可以写在同一行;
        int age1 = 19;
        int e,f = 30;//e没有赋值,f赋值30

        //[3]变量的使用
        System.out.println(age);//使用变量的时候通过名字访问到空间中具体的值
        System.out.println(age + 10);
        int g = 20;
        System.out.println( age + g);
    }
}
