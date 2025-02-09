package com.msb.test01;

public class TestOpe {
    public static void main(String[] args) {
        //[1]算术运算符
        //加号:作用(1)表示正数 (2)表示相加 (3)字符串拼接
        System.out.println(+10);
        System.out.println(5 + 6);
        int num = 10;
        System.out.println("输出一个数" + num);
        System.out.println(5 + 6 + "abd");
        System.out.println("abc" + 5 + 6);


        //++自增;
        int a = 5;
        a++;
        System.out.println(a);
        a = 5;
        ++a;
        System.out.println(a);
        //无论++放在变量前,还是放在变量后,都是+1操作;


        //如果自增参与到表达式中;
        a = 5;
        int m = a++ +7;//如果++在变量后,就是先运算,后加1,即 m = a + 7,a+1
        System.out.println(a);//6
        System.out.println(m);//12


        a = 5;
        int n = ++a +7;//如果++在变量前面,先加1,再运算;a=a+1,n=a+7
        System.out.println(a);//6
        System.out.println(n);//13
    }
}
