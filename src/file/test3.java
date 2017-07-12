package file;

import java.io.File;
import java.io.IOException;

/**常用方法:
 * getName() 文件名 路径名
 * getPath() 路径名
 * getAbsoluteFile() 绝对路径所对应的File对象
 * getAbsolutepath() 绝对路径名
 * getParebt() 父目录,相对路径的父目录,可以为null,删除本身的结果为null
 * 2.判断信息
 *  exists()
 *  canWrite()
 *  isFile()
 *  isAbsolute() 消除平台差异.le以盘符开头,其他以/开头
 *  isDirectory()
 *  3.长度 字节数 不能读取文件夹得长度
 *  length()
 *  4.创建.删除
 *  createNewFile() 不存在新文件 ,存在返回值为false
 *  delete()删除文件
 *  static createTempFile(前缀3个字节长,后缀默认.temp)默认临时空间
 *  staticcreaTempFile(前缀3个字节长,后缀默认.temp,目录)
 *  deletOnExit() 退出虚拟机删除,常用于删除临时文件
 * Created by lenovo on 2017/7/12.
 */
public class test3 {
    public static void main(String[] args) {
        t2();
        try {
            t3();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void t3() throws IOException,InterruptedException {
//        createNewFile();
        String path = "E:/xp/text/200.txt";
        File src = new File(path);
        if (src.exists()) {
            boolean flag = src.createNewFile();
            System.out.println(flag?"成功":"失败");
// *  static createTempFile(前缀3个字节长,后缀默认.temp)默认临时空间
        File temp = File.createTempFile("tes",".temp",new File("e:/xp/test"));
        Thread.sleep(100);
        temp.deleteOnExit();

        }
    }


    //判断信息
    public static void t2() {
//        String path = "2.txt";
        String path = "E:/xp/test/22.jpg";
        File src = new File(path);
        System.out.println("文件是否存在:"+src.exists());
        System.out.println("文件是否可读"+src.canRead());
        System.out.println("文件是否可写"+src.canWrite());
        System.out.println("=======");
//        isFile();
//        isDirectory();
        if (src.isFile()) {
            System.out.println("文件");
        } else if (src.isDirectory()){
            System.out.println("文件夹");
        } else {
            System.out.println("文件不存在");
        }
        System.out.println("是否为绝对路径"+src.isAbsolute());
        System.out.println("长度为" + src.length());
    }


    //名称
    public static void t1() {
        //File src = File("E:/xp/test/2.jpg);
        File src = new File("2.txt");
        System.out.println("返回名称"+src.getName());
        System.out.println("若果是绝对路径,返回完整路径,否则返回相对路径"+src.getPath());
        System.out.println("返回绝对路径"+src.getAbsolutePath());
        System.out.println("返回上一级目录,如果是相对,返回null");

    }
}
