package Ipwl.Server2;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by lenovo on 2017/7/18.
 */
public class Server7 {
    private ServerSocket server;
    private boolean isShutdown = false;
    public static void main(String[] args) {
        Server7 server = new Server7();
        server.start();
    }
    public void start() {
        //默认端口为8888
        start(8888);
    }
    //指定端口
    public void start(int port) {
            try {
                server = new ServerSocket(port);
                this.receive();
            } catch (IOException e) {
                e.printStackTrace();
                isShutdown = false;
            }
    }

    private void receive() {
        try {
            while (!isShutdown) {
                new Thread(new Dispatcher(server.accept())).start();
              }
            } catch(IOException e){
                e.printStackTrace();
                stop();
        }
    }

    public void stop() {
        isShutdown = true;
        try {
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

