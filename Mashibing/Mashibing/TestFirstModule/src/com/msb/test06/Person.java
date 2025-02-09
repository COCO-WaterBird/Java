package com.msb.test06;

/**
*人类
 */
public class Person {
    //特性-属性-名词(只定义和业务逻辑相关的代码)
    String name;//xingming
    int age;//nianling
    double height;//shengao



    //行为-方法-动词(只定义和业务逻辑相关的代码)
    //定义一个学习的方法;
    public void study(){
        System.out.println("青,取之于蓝而亲故蓝");
    }


    //显示编写空构造器;
    public Person(){
        System.out.println("调用了空构造器");
//        age = 19;
//        name = "lili";
//        height = 184.5;

    }
//构造器的参数名字,如果和属性名字重名,就会发生就近原则
//如果重名,你想要给属性赋值,那么就在想表达属性的变量前面加上this,来修饰
//    public Person(int a,String b,double c){
//        age = a;
//        name = b;
//        height = c;

        //一般以这种方式
     public Person(int age,String name,double height){
         this.age = age;
         this.name = name;
         this.height = height;

        }
    }

