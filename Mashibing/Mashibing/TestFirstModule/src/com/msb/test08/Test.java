package com.msb.test08;

public class Test {
    public static void main(String[] args) {
        //定义一个子类具体的对象;
        Student s = new Student();
        s.setSno(100100);
        s.setAge(18);
        s.setName("lili");
        s.setHeight(164.6);

        s.study();
        s.eat();
        s.sleep();
        s.shout();
    }
}
