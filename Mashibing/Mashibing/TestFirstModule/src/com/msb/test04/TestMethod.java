package com.msb.test04;

public class TestMethod {
    //提取一个方法,功能:将2个数求和

    public static void addNum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static void main (String[]args){
        // 调用方法
        addNum(10, 20);
        }

}