package com.msb.test14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
功能: 将程序中的内容输出到文件中去
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //程序中的字符串:
        String str = "abc你好";
        //文件
        File f = new File("/Users/zhangke/Desktop/demo.txt");
        //字符输出流:
        FileWriter fw = new FileWriter(f);
        //shuchu
        fw.write(str);
        fw.close();

        //guanbi
    }
}
