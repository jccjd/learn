package Ipwl.Tcp.test1;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by lenovo on 2017/7/17.
 */
public class closeUtil {
    public static void closeAll(Closeable ... io) {
        for (Closeable temp : io) {
            if (null != temp) {
                try {
                    temp.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
