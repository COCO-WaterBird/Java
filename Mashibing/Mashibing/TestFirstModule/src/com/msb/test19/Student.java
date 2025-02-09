package com.msb.test19;

public class Student extends Person {
    @Override
    public void eat() {
        System.out.println("这是对父类方法进行了重写---学生可以吃火锅,烧烤,大排档");
    }
}
