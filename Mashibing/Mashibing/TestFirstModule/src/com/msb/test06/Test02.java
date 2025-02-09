package com.msb.test06;

public class Test02 {
    public static void main(String[] args) {
       /*
       创建一个person类的对象
      Person()。 -》空构造方法
      new关键字对方法进行调用。 ---〉》构造器作用,底层帮我们创建对象,在创建对象后进行初始化操作


       如果一个类没有显式编写构造器的话,那么系统会为这个类默认分配一个空构造器
       调用构造器以后,对对象进行初始化操作,将对象的地址返回p

       以后尽量保证空构造器的存在,以后学到框架,某些框架底层需要空构造器,如果你没有添加就会报错;
        */
        Person p = new Person(18, "lili", 180.5);
//        p.age = 18;
//        p.name = "lili";
//        p.height = 180.5;
        System.out.println(p.age);

        Person p2 = new Person( 19,"lulu",178.3);
//        p2.age = 19;
//        p2.name = "lulu";
//        p2.height = 178.3;
        System.out.println(p2.age);



    }
}
