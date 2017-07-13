package file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 5.操作目录
 *  mkdir() 创建目录,必须确保父目录存在,如果不存在,创建失败
 *  mkdirs() 创建目录 ,如果父目录连不存在一同创建
 *  listFiles() 文件目录 名字串形式
 *  listFiles()
 *  static listRoots() 根路径
 * Created by lenovo on 2017/7/12.
 */
public class test4 {
    public static void main(String[] args) {
        String  path = "E;/xp/test";
        File src = new File(path);//文件夹
        if (src.isDirectory()) {
            System.out.println("===子目录|文件名===");
            String[] subName = src.list();

            for (String temp : subName) {
                System.out.println("t"+temp);
            }
            System.out.println("===子目录|文件File对象===");
            File[] subFiles = src.listFiles();
            for (File temp : subFiles) {
                System.out.println(""+temp.getAbsolutePath());
            }
            System.out.println("===子文件.Java对象===");
            //命令设计模式
            subFiles = src.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return new File(dir,name).isFile() && name.endsWith(".java");
                }
            });

            for (File temp : subFiles) {
                System.out.println(""+temp.getAbsolutePath());
            }
         }


    }

}
