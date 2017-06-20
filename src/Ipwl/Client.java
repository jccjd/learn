package Ipwl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/** test
 * Created by lenovo on 2017/6/18.
 */
public class Client {
    public static void main(String[] args) {
        String str="";
        try {
            Socket socket = new Socket("localhost", 90);

            OutputStream out = socket.getOutputStream();
            BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
            StringBuffer sb= new StringBuffer();
            out.write(sb.toString().getBytes());
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
