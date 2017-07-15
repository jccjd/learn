package Ipwl.URL;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lenovo on 2017/7/15.
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.badu.com");
        //获取资源 网络流
        /*
        InputStream is = url.openStream();
        byte[] flush = new byte[1024];
        int len = 0;
        while (-1 != (len = is.read(flush))) {
            System.out.println(new String(flush, 0, len));
        }
        is.close();
    */
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("abdu2.html"),"utf-8"));
        String msg = null;
        while ((msg = br.readLine())!=null) {
            System.out.println(msg);
            bw.append(msg);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
