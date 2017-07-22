package Ipwl.servertest4;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by lenovo on 2017/7/19.
 */
public class Dispatcher implements Runnable {
    private Socket client;
    private Request req;
    private Response rep;
    private int code = 200;

    @Override
    public void run() {
        try {
            Serverlet serv = WebApp.getServerlet(req.getUrl());
            if (null == serv) {
                this.code = 404;
            } else {
                serv.service(req, rep);
            }
            rep.pushTOCLient(code);
            } catch (Exception e) {
                e.printStackTrace();
                this.code = 500;
            }
            rep.pushTOCLient(500);
    }
    Dispatcher(Socket client) {
        this.client = client;
        try {
            req = new Request(client.getInputStream());
            rep = new Response(client.getOutputStream());
        } catch (IOException e) {
            code = 500;
            return;
        }
    }
}
