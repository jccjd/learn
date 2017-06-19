package Ipwl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/** test
 * Created by lenovo on 2017/6/18.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9527);
            OutputStream out = socket.getOutputStream();
            out.write("This is my first time visit to server:\n".getBytes());
            out.write("hello\n".getBytes());
            out.write("exit\n".getBytes());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
