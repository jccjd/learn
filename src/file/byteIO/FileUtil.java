package file.byteIO;

import java.io.*;

/**
 * 文件操作
 * 1.文件拷贝
 * 2.文件夹拷贝 拒绝自己拷贝给自己
 * Created by lenovo on 2017/7/13.
 */
public class FileUtil {

    public static void copyDir(String srcPath, String destPath) throws FileNotFoundException,IOException{
        //拒绝自己拷贝给自己
        if (srcPath.equals(destPath)) {
            return;
        }
        File src = new File(srcPath);
        File dest = new File(destPath);
        copyDir(src,dest);

    }
    public static void copyDir(File src, File dest) throws FileNotFoundException,IOException {
        if (src.isDirectory()) {
            dest = new File(dest,src.getName());
            if (dest.getAbsolutePath().contains(src.getAbsolutePath()));
            System.out.println("父目录不能拷贝到子目录中");
            return;
        }
        copyDirDetail(src,dest);
    }

    private static void copyDirDetail(File src, File dest) throws FileNotFoundException, IOException{
        if (src.isFile()) {
            FileUtil.copyFile(src,dest);

        } else if (src.isDirectory()) {
            //确保目标文件存在
            dest.mkdirs();
            for (File sub: src.listFiles()
                 ) {
                copyDirDetail(sub, new File(dest,sub.getName()));
            }
        }

    }

    private static void copyFile(String src, String dest) throws FileNotFoundException,IOException{
        //1建立联系
        copyFile(new File(src),new File(dest));
    }

    private static void copyFile(File src, File dest) throws FileNotFoundException,IOException{
        if (! src.isFile()) {
            System.out.println("只能拷贝文件");
            throw  new IOException("只能拷贝文件");

        }
        //dest为已经存在的文件夹, 不能建立于文件夹同名的文件
        if (dest.isDirectory()) {
            System.out.println(dest.getAbsolutePath()+"不能建立于文件夹同名的文件");
            throw  new IOException(dest.getAbsolutePath()+"不能建立于文件夹同名的文件");
        }
        //2.选择流
        InputStream is = new BufferedInputStream(new FileInputStream(src));
        OutputStream os = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] flush = new byte[1024];
        int len = 0;
        //读取
        while (-1 != is.read(flush)) {
            //写出
            os.write(flush, 0 ,len);

        }
        os.flush();
        os.close();
        is.close();
    }


}
