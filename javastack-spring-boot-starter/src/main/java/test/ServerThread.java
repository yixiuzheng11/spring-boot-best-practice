package test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
    监听线程
 */
public class ServerThread implements Runnable{
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(Constant.PORT);
            while(true) {
                Socket socket = serverSocket.accept();
                //开启新线程处理数据
                new Thread(new ServerProcessThread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
