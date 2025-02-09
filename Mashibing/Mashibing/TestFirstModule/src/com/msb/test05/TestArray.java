package com.msb.test05;

public class TestArray {
    public static void main(String[] args) {
        //数组声明:以int类型数组为案例:
        int[] arr;//定义一个int类型的数组,名字是arr
        //数组的创建
        arr = new int[4];//在创建时要给定数组的长度,创建一个长度为4的int类型的数组
        //int[] arr = new int[4];合成一句话,底层默认长度为4的空间,每个元素有默认值:0
        //数组的赋值;
        arr[0] = 15;
        arr[1] = 91;
        arr[2] = 47;
        arr[3] = 62;
        //数组的使用
        System.out.println(arr[3]);
        System.out.println(arr[0] +30);

        //数组的遍历(查看数组中的每一个元素)
        System.out.println("数组查看:最简单粗暴的方式");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);//重复,通过循环简化

        System.out.println("数组的查看:for循环方式");
        for(int i = 0;i <=3;i++){ //i代表元素索引
            System.out.println("第"+ i+ "个元素" + arr[i]);
        }

        System.out.println("数组的查看:增强for循环方式:");
        for(int num:arr){//对arr数组进行遍历,遍历出来的每一个元素用num变量接收
            System.out.println(num);//每次循环输出num的数值
        }
/*
for循环和增强for循环的区别:
for循环可以涉及与索引相关操作
增强for循环写起来简单
 */
    }
}
