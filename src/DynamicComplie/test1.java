package DynamicComplie;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;

/**
 *
 */
public class test1 {
    public static void main(String[] args) throws IOException {

        //通过IO流操作,将字符串存储为临时文件然后调用动态编译方法
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null,"E:/dc/te.java");
        System.out.println(result == 0 ? "编译成功":"编译失败");

        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("java -cp  E:/dc te");
        InputStream in = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String info = "";
        while ((info = reader.readLine()) !=null) {
            System.out.println(info);
        }
        try {
            URL[] urls = new URL[] {new URL("file:/"+ "e:/dc/")};
            URLClassLoader loader = new URLClassLoader(urls);
            Class cls = loader.loadClass("te");
            Method m = cls.getDeclaredMethod("main",String[].class);
            m.invoke(null, (Object) new String[]{});
            /*由于可变参数是jdk5.0后才有的上面的代码会编译成:m.invoke(null,"ss","sss")/
            * m.invoke((Object)null); m.invoke((Object)null, new String[0]);
            * 就会发生参数不匹配的错误:
            *   java.lang.IllegalArgumentException: wrong number of arguments
            * 因此要加上(Object)转型避免这个问题
            * */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
