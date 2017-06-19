package Examination_practice;

import file.wordcount;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by lenovo on 2017/6/19.
 */
public class againIO {
    public static int wordcount(String filepath,String word){
        int count=0;
        int hasread=-1;
        String sentance="";
        byte[] buffer= new byte[1024];
        FileInputStream fis=null;
        word=word.toLowerCase();
        try {
            fis= new FileInputStream(filepath);
            while ((hasread=fis.read(buffer))!=-1){
                sentance=new String(buffer,0,hasread);
                int index=sentance.indexOf(word);
                while (index>=0){
                    count++;
                    index=sentance.indexOf(word,index+word.length());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return count;
    }
}
class Main4{
    public static void main(String[] args) {
        String filepath= "d:1.txt";
        String word="b";
        int count= wordcount.getWordCount(filepath,word);
        System.out.println(count);
    }
}
