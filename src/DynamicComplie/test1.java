package DynamicComplie;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 *
 */
public class test1 {
    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null,"C:\\Users\\lenovo\\Desktop\\code\\rejava\\learn\\src\\DynamicComplie/te.java");
        System.out.println(result == 0 ? "编译成功":"编译失败");
    }
}
