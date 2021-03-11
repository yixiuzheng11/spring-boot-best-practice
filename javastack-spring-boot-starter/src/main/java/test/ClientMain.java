package test;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
    public static void main(String[] args) {
        //开启服务，监听端口
        new Thread(new ServerThread()).start();
        System.out.println("开启服务，监听端口");
        try {
            //建立连接
            Socket socket = new Socket(Constant.HOST, Constant.PORT);
            //开启新线程发送数据
            new Thread(new ClientProcessThread(socket)).start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
