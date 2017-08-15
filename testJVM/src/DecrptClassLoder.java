import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * 解密类加载器
 */
public class DecrptClassLoder  extends ClassLoader{
    private String rootDir;
    public DecrptClassLoder(String rootDir) {
        this.rootDir = rootDir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> c = findLoadedClass(name);

        /*应该先要查询有没有加载过这个类,加载过,直接返回加载好的类,没有则加载新类*/
        if (c != null) {
            return c;
        } else {
            ClassLoader parent = this.getParent();
            try {
                c =parent.loadClass(name);
            } catch (Exception e) {
//                e.printStackTrace();
            }
            if (c != null) {
                return c;
            }else {
                byte[] classDate = getClassDate(name);
                if (classDate == null) {
                    throw new ClassNotFoundException();
                } else {
                    c = defineClass(name, classDate,0 ,classDate.length);
                }
            }
        }
        return c;
    }

    private byte[] getClassDate(String name) {
        String path = rootDir + "/" + name.replace('.', '/') + ".class";
        InputStream is = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            is = new FileInputStream(path);
            int temp = -1;
            while ((temp = is.read()) != -1) {
                baos.write(temp^0xff);
            }
            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
