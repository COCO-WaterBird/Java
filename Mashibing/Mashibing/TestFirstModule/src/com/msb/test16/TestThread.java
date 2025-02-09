package com.msb.test16;
/**
 * 2.创建一个TestThread
 * 3.想要具备多线程能力
 */
public class TestThread extends Thread {
    //4.线程对应的任务放在一个方法;
    //输入 run回车

    @Override
    public void run() {
        //5.输出10个数
        for(int i = 1; i <= 10;i++){
            System.out.println("子线程" + i);
        }

    }
}
