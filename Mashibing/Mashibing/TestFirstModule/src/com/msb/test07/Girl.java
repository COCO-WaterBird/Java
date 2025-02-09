package com.msb.test07;

public class Girl {
    //属性
    private int age;//age加修饰符,只能在当前访问
    //某些场合必须说,有的地方暴露,有的地方隐藏
    //在类的内部访问
    //给age一个赋值方法;

    public void shezhiAge(int age){//不需要返回值,void
//        this.age = age; // this.age代表上面的age,age代表就近的age
        if(age > 30){
            this.age = 18;
        }else{
            this.age = age;
        }

    }


//    }

    //给age提供一个读取值的方法;
    public int duquAge(){
        return age;
    }
}
