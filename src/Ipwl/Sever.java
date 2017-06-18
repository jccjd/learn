package Ipwl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lenovo on 2017/6/18.
 */
public class Sever {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9527);
            System.out.println("server start");
            Socket socket = server.accept();
            System.out.println("Creating a customer connection");
            InputStream input =socket.getInputStream();
            InputStreamReader isreader = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isreader);
            while (true){
                String str = reader.readLine();
                if (str.equals("exit"))
                    break;
                System.out.println("Receive content"+str);

            }
            System.out.println("disconnect");
            reader.close();
            isreader.close();
            input.close();
            server.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
