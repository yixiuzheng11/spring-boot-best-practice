package test;

import java.io.*;
import java.net.Socket;

public class ServerProcessThread implements Runnable{
    private Socket socket;

    public ServerProcessThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        //获取客户端的数据,并写回
        //等待响应
        try {
            // 读取客户端数据
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "";
            String requestStr = "";
            System.out.println("来自客户端的数据:");
            while((line = bufferedReader.readLine()) != null){
                requestStr += line;
                System.out.println(line);
            }
            // 从服务端发给客户端数据
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("data from server " + requestStr + "\r\n");
            writer.flush();
            writer.close();
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
