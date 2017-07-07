package deepmap;

/**
 * javabean 存储数据po bo vo 包含setter于getter访问器的类
 *
 * Created by lenovo on 2017/7/7.
 */
public class Letter {
    private String name;
    private int count;

    public Letter(String name, int count) {
        super();
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
