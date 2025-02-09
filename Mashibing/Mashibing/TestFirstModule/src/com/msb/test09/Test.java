package com.msb.test09;

public class Test {
    public static void main(String[] args) {
//        //创建女孩的实例、对象;
        Girl g = new Girl();
//        //创建猫的实例、对象
////        Cat c = new Cat();
//        //创建狗的实例、对象;
//        Dog d = new Dog();
//        //女孩玩小猫
////        g.play(c);

        //小女孩跟动物玩
        Animal an;//定义一个动物,这个动物是什么未知
        Cat c = new Cat();//具体的猫
        an = c;//让动物是一只具体的猫 -》父类引用指向子类对象:多态性
        //合成一句,Animal an = New cat
        g.play(an);
    }
}
