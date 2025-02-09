package com.msb.test11;

public class Test01 {
    public static void main(String[] args) {
        try{
        //两个数求商
            int num1 = 12;
            int num2 = 0;//如果为0,除法就会报错;
            System.out.println("两个数的商为" + num1/num2);
        }catch (Exception ex){//(InputMismatchException ex)
            System.out.println("对不起,程序出现了错误");
        }finally{
            System.out.println("程序无论是否出现异常,这个逻辑都必须执行");
        }
        System.out.println("上面是两个数相除的案例1");
        System.out.println("上面是两个数相除的案例2");
        System.out.println("上面是两个数相除的案例3");
    }
}
