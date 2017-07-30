import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * 测试脚本引擎执行JavaScript代码
 */
public class test1 {
    public static void main(String[] args) {
        //获取脚本引擎对象
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("js");

    }
}
