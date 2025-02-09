package com.msb.test13;

public class Book {//书籍
    //属性:
    //书籍编号:
    private int bNo;
    //书籍名称:
    private String bName;
    //书籍作者:
    private String bAuthor;
//command N 设置getter 和 setter 方法

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }


    //加3个参数的构造器,command n,constructor,选3个


    public Book(int bno, String bName, String bAuthor) {
        this.bNo = bno;
        this.bName = bName;
        this.bAuthor = bAuthor;
    }

    //无参数构造


    public Book() {

    }
}
