package com.msb.test03;

import sun.print.SunMinMaxPage;

public class TestWhile {
    public static void main(String[] args) {
        //功能:求和
        //给5个变量
//        int num1 = 1;
//        int num2 = 2;
//        int num3 = 3;
//        int num4 = 4;
//        int num5 = 5;
//
//        //定义1个变量,用来接收和
//        int sum = 0;
//        sum += num1;
//        sum += num2;
//        sum += num3;
//        sum += num4;
//        sum += num5;
//        //输出和
//        System.out.println("he" + sum);

        //功能:求和
        //定义1个变量来接收和
//        int num = 1;
//        int sum = 0;
//        sum += num;
//        num++;
//        sum += num;
//        num++;
//        sum += num;
//        num++;
//        sum += num;
//        num++;
//        sum += num;
//        num++;
//        //输出和
//        System.out.println("he" + sum);
//        System.out.println(num);

        //重复代码太多了
        int num = 1;
        int sum = 0;
        while (num <= 5){//如果表达式结果是true,那么就变成死循环
        sum += num;
        num++;
        }
        System.out.println("he" + sum);



    }
}
