package com.msb.test01;

public class TestOpe3 {
    public static void main(String[] args) {
        //关系运算符==,最终结果是布尔值,要么true,要么是fasle
        System.out.println(5 == 6);


        //逻辑运算符:左右连接的是布尔值
        //&&,只有两个都是true,结果才是true
        System.out.println(true&&false);
        System.out.println(true&&true);
        System.out.println(false&&false);
        System.out.println(false&&true);

        //||逻辑
        //只要有一个操作数是true,结果就是true
        System.out.println(true||false);
        System.out.println(true||true);
        System.out.println(false||false);
        System.out.println(false||true);
    }
}
