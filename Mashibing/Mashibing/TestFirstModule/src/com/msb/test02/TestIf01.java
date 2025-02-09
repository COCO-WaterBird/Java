package com.msb.test02;

public class TestIf01 {
    public static void main(String[] args) {
        //需求:判断一个数是否大于10

        //给定一个数
        int num = 13;
        //判定
        if(num > 10){//if后面是一个表达式,这个表达式的结果是布尔值,只有这个表达式的返回结果是true的时候.才会走入后面的{}中
            System.out.println("这个数是大于10的数字");//如果int=8,控制台就看不到这句话了
        }
    }
}
