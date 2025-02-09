package com.msb.test09;

public class Dog extends Animal {
    public void shout(){
        System.out.println("狗-汪汪叫");////子类shout方法对父类方法不满意,相当于进行了方法的重写
    }
    //看家护院;
    public void guard(){
        System.out.println("狗-忠诚的动物-可以看家护院");
    }
}
