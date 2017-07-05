package Collection;

/**自定义map的升级
 * 1，提高查询效率
 * Created by lenovo on 2017/7/5.
 */
public class map02 {
    Linkedlist[] arr = new Linkedlist[999];//map的底层结构就是数组+链表
    int size;

    public void put(Object key, Object value) {
        SxtEntry e = new SxtEntry(key,value);

        int hash = key.hashCode();
        hash = hash<0?-hash:hash;

        int a = hash%arr.length;
        if (arr[a] == null) {
            Linkedlist list = new Linkedlist();
            list.add(e);
            arr[a] = list;
        } else {
            Linkedlist list = arr[a];
            for (int i= 0; i < list.size(); i++) {
                SxtEntry e1 = (SxtEntry) list.get(i);
                if (e1.key.equals(key)) {
                    e1.value = value;//键值相同直接覆盖
                    return;
                }
            }
            arr[a].add(e);
        }

    }

    public Object get(Object key) {
        int a = key.hashCode()%arr.length;
        if (arr[a] != null) {
            Linkedlist list = arr[a];
            for (int i= 0; i < list.size(); i++) {
                SxtEntry e = (SxtEntry) list.get(i);
                if (e.key.equals(key)) {
                    return e.value;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        map02 m = new map02();
        m.put("l0",new Wife("h0"));
        m.put("l0",new Wife("h1"));
        m.put("l2",new Wife("h2"));
        Wife w = (Wife) m.get("l0");
        System.out.println(""+w.name);

    }

}
