import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * 测试脚本引擎执行JavaScript代码
 */
public class test1 {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException, IOException {
        //获取脚本引擎对象
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("js");

        //定义变量,存储到引擎上下文中
        engine.put("msg","I'm is a good man");
        String str = "var user = { name:'lilong', age:20, schools:[ '清华大学','北京大学' ] };";
        str += "print(user.age);";

        //执行脚本
        engine.eval(str);
        engine.eval("msg = 'Im not a good man';");
        System.out.println(engine.get("msg"));
        //定义函数
        engine.eval("function add(a,b){var sum = a + b; return sum;}");
        /*取得调用接口*/
        Invocable jsinvoke = (Invocable) engine;
        /*执行脚本中定义的方法*/
        Object result1 = jsinvoke.invokeFunction("add", new Object[]{12,20});
        System.out.println(result1);
        /*导入其它Java包,使用其它包中的类*/
        String jscode ="importPackge(java.util); var list = Arrays.asList([\"北京大学\",\"清华大学\"]);";
        engine.eval(jscode);
        List<String> list2 = (List<String>) engine.get("list");
        for (String temp : list2) {
            System.out.println("temp = [" + temp + "]");
        }
        //执行一个js文件
        URL url = test1.class.getClassLoader().getResource("a.js");
        FileReader fileReader = new FileReader(url.getPath());
        engine.eval(fileReader);
        fileReader.close();

    }
}
