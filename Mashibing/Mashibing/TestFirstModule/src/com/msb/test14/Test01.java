package com.msb.test14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
功能:读取文件内容
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //将文件封装为具体的file类的对象
        File f = new File("/Users/zhangke/Desktop/test1.txt");//声明位置
        //“管子”“流” 输入的流,处理数据大小的划分:字节还是字符流--输入字符流--
        FileReader fr = new FileReader(f);//将这个管子怼到文件上
  /*
        //开始动作 - “吸”
        int n1 = fr.read();
        System.out.println(n1);
        //先用read再输出
        int n2 = fr.read();
        System.out.println(n2);

        int n3 = fr.read();
        System.out.println(n3);
        int n4 = fr.read();
        System.out.println(n4);
        int n5 = fr.read();
        System.out.println(n5);
        int n6 = fr.read();
        System.out.println(n6);
        int n7 = fr.read();
        System.out.println(n7);
        //-1代表文件的结尾
*/
        int n = fr.read();
        while (n != -1) {//什么时候n的结果是-1,循环就停止了
            System.out.print(n);
            n = fr.read();
        }
        //流关闭操作;
        fr.close();
    }
}
