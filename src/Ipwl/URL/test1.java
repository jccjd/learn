package Ipwl.URL;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lenovo on 2017/7/15.
 */
public class test1 {
    //绝对路径构建
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.badu.com:80/index.hteml?uname=bjsxt");
        System.out.println("协议:"+url.getProtocol());
        System.out.println("域名:"+url.getHost());
        System.out.println("端口:"+url.getPath());
        System.out.println("资源:"+url.getFile());
        System.out.println("锚点:"+url.getRef());
        System.out.println("参数:"+url.getQuery());//?参数 : 存在锚点返回null ,不存在 返回正确

        url = new URL("http://www.badu.com:80/a");
        url = new URL(url, "b.txt");//相对路径
        System.out.println(""+url.toString());

    }
}
