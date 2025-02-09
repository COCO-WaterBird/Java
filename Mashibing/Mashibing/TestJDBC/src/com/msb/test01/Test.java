package com.msb.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动;准备电话
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接, 准备拨号
        String url = "jdbc:mysql://localhost:3306/msb";//本机mysql,
        String username = "root";
        String password = "root1919";

        Connection conn= DriverManager.getConnection(url,username,password);
        //创建会话
        Statement sta = conn.createStatement();//开始拨通
        //发送SQL;

        int i = sta.executeUpdate("insert into t_book(id,name,author,price)value(3,'红高粱','莫言',49)");
        //处理结果;电话内容
        if(i > 0){//证明对数据库的数据条有影响,电话结果借不借钱
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
        //关闭资源;挂电话
        sta.close();
        conn.close();

    }
}
