package file;

/**
 * Created by lenovo on 2017/5/11.
 */
public class main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String filePath = "e:world.txt";
        String word = "and";
        int count = wordcount.getWordCount(filePath, word);

        System.out.println("单词"+word+"在文章"+filePath+"中出现的次数为："+count);

    }

}
