package com.msb.test01;

import java.sql.*;

public class Test2 {
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

        ResultSet rs = sta.executeQuery("select * from t_book");//如果需要加条件,加while price<48
        while(rs.next()){//判断是否有记录存在,遍历
            System.out.println(rs.getInt("id") + "---" +rs.getString("name") + "--" + rs.getString("author") +"--" + rs.getDouble("price"));

        }


        //处理结果




        //关闭资源;挂电话
        sta.close();
        conn.close();

    }
}
