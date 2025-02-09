package com.msb.test02;

import java.io.*;
import java.sql.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        while (true) {//死循环
            //打印菜单:
            System.out.println("------欢迎来到[老马书城]------");
            System.out.println("1.根据书籍编号查询书籍信息");
            System.out.println("2.查询所有书籍信息");
            System.out.println("3.删除指定书籍编号对应的书籍");
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
                //键盘录入书籍编号
                System.out.println("请录入你想要查看的书籍的编号");
                int bno = sc.nextInt();
                //根据编号查询对应书籍
                Book b = findBookByBno(bno);
                //通过b的结果来判定书籍是否查询到
                if (b == null) {
                    System.out.println("你想要查询的书籍不存在");
                } else {//书籍存在
                    System.out.println("当前查询到一本书:《" + b.getName() + "》");

                }
            }
            if (choice == 2) {
                //查询所有书籍
                ArrayList books = findBooks();
                if (books.size() == 0) {
                    System.out.println("没有查询到书籍");
                } else {
                    for (int i = 0; i <= books.size() - 1; i++) {
                        Book b = (Book) (books.get(i));
                        System.out.println(b.getId() + "--" + b.getName());
                    }
                }
            }


            if (choice == 3) {
                //录入删除书籍的编号;
                System.out.println("请录入你想要删除的书籍编号");
                int bno = sc.nextInt();
                int n = delBookByBno(bno);
                if (n <= 0) {
                    System.out.println("删除失败");

                }else{
                    System.out.println("删除成功!");
                }

            }

            if (choice == 4) {
                System.out.println("[老马书城]>>>>>>4.展示书籍");
                break;//停止正在执行的循环
            }

        }
    }

    //根据编号查询对应的书籍;
    public static Book findBookByBno(int bno) throws ClassNotFoundException, SQLException {
        Book b = null;


        //加载驱动;准备电话
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接, 准备拨号
        String url = "jdbc:mysql://localhost:3306/msb";//本机mysql,
        String username = "root";
        String password = "root1919";
        Connection conn = DriverManager.getConnection(url, username, password);
        //创建会话
        Statement sta = conn.createStatement();//开始拨通
        //发送SQL;

        ResultSet rs = sta.executeQuery("select * from t_book where id = " + bno);//如果需要加条件,加while price<48
        if (rs.next()) {//如果结果只有一条,想要获得的话,用if就行,不用while
//            System.out.println(rs.getInt("id") + "---" +rs.getString("name") + "--" + rs.getString("author") +"--" + rs.getDouble("price"));
//            先将结果做接收
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String author = rs.getString("author");
            double price = rs.getDouble("price");

            b = new Book();
            b.setId(id);
            b.setName(name);
            b.setAuthor(author);
            b.setPrice(price);


        }

        //将上面的数据封装为一个对象


        //处理结果
        //关闭资源;挂电话
        rs.close();


        sta.close();
        conn.close();

        return b;
    }


    public static ArrayList findBooks() throws ClassNotFoundException, SQLException {
        //定义集合
        ArrayList list = new ArrayList();
        //加载驱动;准备电话
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接, 准备拨号
        String url = "jdbc:mysql://localhost:3306/msb";//本机mysql,
        String username = "root";
        String password = "root1919";
        Connection conn = DriverManager.getConnection(url, username, password);
        //创建会话
        Statement sta = conn.createStatement();//开始拨通
        //发送SQL;

        ResultSet rs = sta.executeQuery("select * from t_book");//如果需要加条件,加while price<48
        while (rs.next()) {
//            System.out.println(rs.getInt("id") + "---" +rs.getString("name") + "--" + rs.getString("author") +"--" + rs.getDouble("price"));
//            先将结果做接收
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String author = rs.getString("author");
            double price = rs.getDouble("price");

            Book b = new Book();
            b.setId(id);
            b.setName(name);
            b.setAuthor(author);
            b.setPrice(price);

            //将书籍放入集合中;
            list.add(b);
        }


            sta.close();
            conn.close();

            return list;


    }


    public static int delBookByBno(int bno) throws ClassNotFoundException, SQLException {
        //加载驱动;准备电话
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接, 准备拨号
        String url = "jdbc:mysql://localhost:3306/msb";//本机mysql,
        String username = "root";
        String password = "root1919";
        Connection conn = DriverManager.getConnection(url, username, password);
        //创建会话
        Statement sta = conn.createStatement();//开始拨通
        //发送SQL;

        int n = sta.executeUpdate("delete from t_book where id = " + bno);//如果需要加条件,加while price<48



        sta.close();
        conn.close();

        return n;
    }

}


