package test;

import java.io.*;
import java.net.Socket;

public class ClientProcessThread implements Runnable{
    private Socket socket;

    public ClientProcessThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        //写数据,等待响应,输出响应
        String requestStr = "data from client \r\n";
        try {
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write(requestStr);
            writer.flush();
            socket.shutdownOutput();
            //等待响应
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            System.out.println("来自服务端的响应:");
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            writer.close();
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
