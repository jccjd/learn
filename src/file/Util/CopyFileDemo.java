package file.Util;

import java.io.*;
import java.lang.reflect.Field;

/**1. 建立联系 File对象 源头 目的地
 * 2. 选择流
 *      文件输入流 InputStream FileInputStream
 *      文件输出流 OutputStream FileOutputStream
 * 3. 操作 : 拷贝
 *      byte[] flush = new byte[1024];
 *      int len = 0;
 *      while(-1 != (len=输入流.read(flush))) {
 *          输出流.write(flush.len);
 *      }
 *      输出流.flush
 * 4. 释放资源: 关闭 两个流
 *
 * Created by lenovo on 2017/7/13.
 */

public class CopyFileDemo {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        String src = "e:/xp/test/";
        String dest = "E:/xp/test/4.jpg";

    }

    /*文件的拷贝
     * @param 源文件路径
     * @param 目录文件路径
     *
     * @throws FileNotFoundException,IOException
     * @return
     * */

    public static void copyFile(String srcPath, String DestPath) throws FileNotFoundException,IOException {
        //1.建立联系 源(存在且为文件)+目的地(文件可以不存在)
        File src = new File(srcPath);
        File dest = new File(DestPath);
        if (!src.isFile()) {
            System.out.println("只能拷贝文件");
            throw new IOException("z只能拷贝文件");
        }
        //2.选择流
        InputStream is = new FileInputStream(src);
        OutputStream os = new FileOutputStream(dest);
        //3.文件的拷贝 循环+读取+写出
        byte[] flush = new byte[1024];
        int len = 0;
        //读取
        while(-1 != (len = is.read(flush))) {
            //写出
            os.write(flush,0,len);
        }
        os.flush();
        //关闭流
    }
}
