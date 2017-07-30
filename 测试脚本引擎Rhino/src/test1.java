import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 测试脚本引擎执行JavaScript代码
 */
public class test1 {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
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
        String jscode =""

    }
}
