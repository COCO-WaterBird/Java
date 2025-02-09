package com.msb.test15;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建一个集合,用于存放相同的个体---》书籍对象:-----〉》注意作用范围,将list放在循环外面

        while (true) {//死循环
            //打印菜单:
            System.out.println("------欢迎来到[老马书城]------");
            System.out.println("1.展示书籍");
            System.out.println("2.上新书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            //借助Scanner类;帮助完成键盘扫描
            Scanner sc = new Scanner(System.in);//new创建对象,创建了构造器,system in 是参数
            //给友好型提示
            System.out.println("请录入你想执行的功能的序号");
            //利用键盘录入序号:
            int choice = sc.nextInt();
            //键盘录入数据以后,必须点击回车,程序才能接收到;

//        System.out.println(choice);

            //根据choice 录入的功能序号进行后续的判断
            if (choice == 1) {
                System.out.println("[老马书城]>>>>>>1.展示书籍");
                //对集合就行遍历查看
//                System.out.printxln(list);

                //从文件中读取list数据
                File f = new File("/Users/zhangke/Desktop/demo.txt");

                //对f做判断:
                if (f.exists() == true) {//文件存在,布尔值,true代表存在
                //文件存在,证明之前的集合中已经有书籍,需要先读取再追加新的书籍

                    //流
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    //将集合读取;
                    ArrayList list = (ArrayList) (ois.readObject());//list--》从文件中读取的集合

                    for (int i = 0; i <= list.size() - 1; i++) {
                        Book b = (Book) (list.get(i));
                        System.out.println(b.getbNo() + "---" + b.getbName() + "---" + b.getbAuthor());
                    }

//                    list.add(b);
//                    //将这个集合写出去;
//                    //需要流;
//                    FileOutputStream fos = new FileOutputStream(f);
//                    //在外面再套一个流
//
//                    ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//                    //将list写出
//                    oos.writeObject(list);
//
//                    //关闭流,只需要关闭最外面的,里面的会跟着关闭
//                    oos.close();

                } else {//文件不存在给提示
                    //证明是第一次上新书籍
                    System.out.println("当前没有上新书籍,请先上新书籍进行展示");
                }
            }


            if (choice == 2) {
                        System.out.println("[老马书城]>>>>>>2.上新书籍");
                    }

                    //从键盘录入书籍信息
                    System.out.println("请录入书籍编号:");
                    int bNo = sc.nextInt();

                    //录入书籍的名字
                    System.out.println("请录入书籍名字:");
                    String bName = sc.next();
                    System.out.println("请录入书籍作者:");
                    String bAuthor = sc.next();


                    //每上新一本书籍,就要创建一本书籍对象:
                    Book b = new Book();
                    b.setbNo(bNo);
                    b.setbName(bName);
                    b.setbAuthor(bAuthor);

                    File f = new File("/Users/zhangke/Desktop/demo.txt");

                    //对f做判断:
                    if (f.exists() == true) {//文件存在,布尔值,true代表存在
                        //文件存在,证明之前的集合中已经有书籍,需要先读取再追加新的书籍

                        //流
                        FileInputStream fis = new FileInputStream(f);
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        //将集合读取;
                        ArrayList list = (ArrayList) (ois.readObject());//list--》从文件中读取的集合

//                        for (int i = 0; i <= list.size() - 1; i++) {
//                            Book b = (Book) (list.get(i));
//                            System.out.println(b.getbNo() + "---" + b.getbName() + "---" + b.getbAuthor());
//                        }
//                        集合读取出来,再追加新的书籍
                        list.add(b);


                    } else {//文件不存在给提示
                        //证明是第一次上新书籍
                        System.out.println("当前没有上新书籍,请先上新书籍进行展示");
                        //相同个体放一起叫集合
                        ArrayList list = new ArrayList();//空集合

                        list.add(b);//添加个体到集合中去,每录一本填进去一本
                        //添进去以后,执行功能1
                        //将集合对象写出道硬盘盘符文件中去
                        //文件



                        //从文件中读取list数据
                        //File f = new File("/Users/zhangke/Desktop/demo.txt");


                        //需要流;
                        FileOutputStream fos = new FileOutputStream(f);
                        //在外面再套一个流

                        ObjectOutputStream oos = new ObjectOutputStream(fos);

                        //将list写出
                        oos.writeObject(list);

                        //关闭流,只需要关闭最外面的,里面的会跟着关闭
                        oos.close();
                        //            fos.close();



                    }
            }














            /*书籍信息:
            书籍编号 书籍名称 书籍作者
            01 项目驱动零起点学JAVA 马士兵   ------》封装为一个书籍对象------〉》类:书籍

             */


//            if (choice == 3) {
//                System.out.println("[老马书城]>>>>>>3.下架书籍");
//                //录入你要下架的书籍的编号:
//                System.out.println("请录入你要下架的书籍的编号");
//
//                int delNo = sc.nextInt();
                //下架编号对应的书籍
//                for (int i = 0; i <= list.size() - 1; i++) {
//                    Book c = (Book)(list.get(i));
//                    if(c.getbNo() == delNo) {//如果遍历的书籍编号和录入的要删除的书籍编号一致,那么从集合中移除该书籍即可
//                        list.remove(c);
//                        System.out.println("书籍下架成功");
//                        break;//如果下架成功,停止遍历
//                    }
//                }

//            }

//            if (choice == 4) {
//                System.out.println("[老马书城]>>>>>>4.展示书籍");
//                break;//停止正在执行的循环
//            }
//            如何让程序连续执行,反复重复做,


        }

    }

