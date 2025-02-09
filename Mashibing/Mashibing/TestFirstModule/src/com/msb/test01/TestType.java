package com.msb.test01;

public class TestType {
    public static void main(String[] args) {
        //基本数据类型;
        //[1]整数类型
        byte a = 10;//-128-127
        short b = 20;//正负3万左右
        int c = 30;//正负21亿
        long d = 12345678910L;//很大很大,如果表示数的范围超过int类型范围就需要加L
        //不同类型开拓的空间大小不一样,表述范围不一样

        //[2]浮点类型;
        float e = 3.14f; //如果用float类型表示一个小数,后面必须加上f
        double f = 3.14;
        ;

        //[3]字符型
        char g = 'a';//单引号引起来的单个字符
        System.out.println("nihao");//双引号里叫字符串,单个字符组合到一起


        //[4]布尔类型
        boolean flag = true;//布尔值只有两个: true,false
    }
}
