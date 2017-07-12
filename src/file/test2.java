package file;

import java.io.File;

/**
 * 相对路径与绝对路径构造File对象
 * 1.相对路径
 *  File(Stirng parint,String child)   --->File("E:/xp/test","2.jpg");
 *  File(String parint,String child)  -->File(new File("E:/xp/test/"),"2.jpg");
 * 2.绝对路径
 *  File(String name)
 * Created by lenovo on 2017/7/12.
 */
public class test2 {
    public static void main(String[] args) {
        String parentPath = "E:/xp/test";
        String name = "2.jpg";
        //相对路径
        File src = new File(parentPath,name);
        src = new File(new File(parentPath),name);
        //输出
        System.out.println(""+src.getName());
        System.out.println(""+src.getPath());
        //绝对路径
        src = new File("E:/xp/test/2.jpg");
        System.out.println(""+src.getPath());
        System.out.println(""+src.getName());
        //没有盘符:以当前工作空间路径为主
        src = new File("test.text");
        System.out.println(""+src.getAbsolutePath());

        src = new File(".");
        System.out.println(""+src.getAbsolutePath());
    }
}
