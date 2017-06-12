package file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Created by lenovo on 2017/5/11.
 */
public class wordcount {
    public static int getWordCount(String fileName,String word){
        byte[] buffer = new byte[1024];
        int hasRead = -1;
        int count=0;
        FileInputStream fis = null;
        String sentence="";
        word = word.toLowerCase();
        try{
            fis=new FileInputStream(fileName);
            while((hasRead=fis.read(buffer))!=-1){
                sentence=new String(buffer,0,hasRead
                ).toLowerCase();

                int index  = sentence.indexOf(word);
                while(index>=0){
                    count++;
                    index=sentence.indexOf(word,index+word.length());
                }
            }
        }
        catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            if(fis!=null){
                try{
                    fis.close();
                }catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
        return count;
    }
}

