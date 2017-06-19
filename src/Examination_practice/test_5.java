package Examination_practice;

import file.wordcount;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/** kashaona
 * Created by lenovo on 2017/6/19.
 */
public class test_5 {
    public static int getWordcound(String articlename,String word){
        int count=0;
        byte[] Buffer=new byte[1024];
        String sentence="";//文章
        int hasread=-1;
        FileInputStream bis=null;//缓存读入流

        word = word.toLowerCase();//将单词转为小写
        try {
            bis= new FileInputStream(articlename);
            while ((hasread=bis.read(Buffer))!=-1){
                sentence=new String(Buffer,0,hasread).toLowerCase();
                int index=sentence.indexOf(word);
                while (index>=0){
                    count++;
                    index=sentence.indexOf(word,index+word.length());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bis!=null){
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return count;
    }

}
class Main2{
    public static void main(String[] args) {
        String filepath="d:1.txt";
        String word="b";
        int count= wordcount.getWordCount(filepath,word);
        System.out.println(count);
    }
}
