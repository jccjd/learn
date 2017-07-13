package file.byteIO;

import file.Util.FilleUtil;

import java.io.File;
import java.io.IOException;

/**文件夹的拷贝
 *  1. 文件 赋值 CopyFile
 *  2.文件 创建 mkdirs()
 *  3.递归查找子结点
 *
 * Created by lenovo on 2017/7/13.
 */
public class CopyDir {
    public static void main(String[] args) {
        //源目录
        String srcpath = "E:/c++/test";
        //目标目录
        String destpath = "E:/c++/test/d";
        try {
            FileUtil.copyDir(srcpath,destpath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void copyDir(String secpath, String destpath) {
        File src = new File(secpath);
        File dest = new File(destpath);
        copyDir(src,dest);

    }
    public void copyDir(File src, File dest) {
        if (src.isDirectory()) {
            dest = new File(dest,src.getName());
        }

    }
    public void copyDirDetail(File src, File dest) {
        if (src.isFile()){

        } else {
            //确保目标文件夹存在
            dest.mkdirs();
            for (File sub : src.listFiles()) {
                copyDirDetail(sub, new File(dest,sub.getName()));
            }
        }
    }
}
