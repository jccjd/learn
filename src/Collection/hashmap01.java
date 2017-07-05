package Collection;

/**自定义实现Map功能
 * 暂不完美
 * Map:存放键值对，根据键找对应的值对象
 * Created by lenovo on 2017/7/5.
 */
public class hashmap01 {

    SxtEntry[] arr =new SxtEntry[990];
    int size;
    /*
    存放键值对
     */
    public void put(Object key, Object value) {
        SxtEntry e = new SxtEntry(key, value);
//        解决键值重复的处理，如果键值重复将前面的直接覆盖
        for (int i = 0; i < size; i++) {
            if (arr[i].key.equals(key)) {
                arr[i].value = value;
                return;
            }
        }
        arr[size++] = e;
    }

    public Object get(Object key) {
        for (int i = 0; i < size; i++) {
            if ( arr[i].key.equals(key)) {
                return arr[i].value;
            }
        }
        return null;
    }

    public boolean containsKey(Object key) {
        for (int i = 0; i < size; i++) {
            if (arr[i].key.equals(key)) {
                return true;
            }
        }
        return false;
    }
    public boolean containsValue(Object value) {
        for (int i = 0; i < size; i++) {
            if (arr[i].value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        hashmap01 m = new hashmap01();
        m.put("l0",new Wife("h0"));
        m.put("l0",new Wife("h1"));
        m.put("l2",new Wife("h2"));
        Wife w = (Wife) m.get("l0");
        System.out.println(""+w.name);


    }
}
class SxtEntry {
    Object key;
    Object value;

    public SxtEntry(Object key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }
}