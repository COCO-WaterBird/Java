package com.msb.test17;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器端启动");
        //套接字
        ServerSocket ss = new ServerSocket(8888);
        //等待客户端发送数据;
        Socket s = ss.accept();
        //服务器端感受到的是输入流;
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        //接收客户端发送
        String str = dis.readUTF();
        System.out.println(str);
        //向客户端发送数据
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好,客户端,我接收到你的信息了");

        //流、网络资源关闭;
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
        //必须先开服务器端
    }
}
