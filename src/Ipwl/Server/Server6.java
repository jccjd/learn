package Ipwl.Server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by lenovo on 2017/7/18.
 */
public class Server6 {
    private ServerSocket server;
    public static void main(String[] args) {
        Server6 server = new Server6();
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
            Serverlet serv = new Serverlet();
            Response rep = new Response(client.getOutputStream());
            Request req = new Request(client.getInputStream());
            serv.service(req,rep);
            rep.pushTOCLient(200);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
