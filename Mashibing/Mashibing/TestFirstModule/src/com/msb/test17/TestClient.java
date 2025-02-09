package com.msb.test17;
import java.io.*;

import java.net.Socket;


public class TestClient {//客户端

    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        //套接字,制定服务器的ip和端口号
        Socket s = new Socket("10.0.0.64",8888);
        //按 Command + Space 调出 Spotlight 搜索，输入 Terminal 并打开。
        //输入以下命令并按下回车：ifconfig
        //对于程序员来说,感受利用输出流在传送数据
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);//处理流
        //往外传送数据;
        dos.writeUTF("nihao,fuwuqi,woshikehuduan");
        //读入是read,输出是write

        //对服务器返回数据进行处理
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("服务器对我说" + str);



        //流关闭
        dos.close();
        os.close();
        s.close();
    }
}
