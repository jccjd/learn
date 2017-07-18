package Ipwl.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lenovo on 2017/7/18.
 */
public class Server2 {
    private ServerSocket server;

    public static void main(String[] args) {
        Server2 server = new Server2();
        server.start();
    }
    public void start() {
        try {
            server = new ServerSocket(8888);
            this.receive();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void receive() {
        try {
            Socket client = server.accept();
            byte[] data = new byte[20480];
            int len = client.getInputStream().read(data);
            String requestInfo = new String(data,0,len).trim();
            System.out.println(requestInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
