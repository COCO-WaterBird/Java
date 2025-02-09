package com.msb.test11;

public class Test02 {
    public static void main(String[] args) {
        try {
            devide();
        } catch (Exception e) {
            System.out.println("异常");;
        }
    }
    //提取一个方法,两个数相除操作:
    public static void devide() throws Exception {
        int num1 = 12;
        int num2 = 0;
        if (num2 == 0){
//            System.out.println("除数为0");
            //人为制造异常

//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                System.out.println("这里异常我自己处理了");;
//            }
            throw new Exception();// new代表创建对象

        }else{
        System.out.println("两个数的商是:" + num1/num2);
    }

    }
}
