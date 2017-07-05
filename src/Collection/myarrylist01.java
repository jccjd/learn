package Collection;

import java.util.ArrayList;
import java.util.List;

/**try again
 * Created by lenovo on 2017/7/2.
 */
public class myarrylist01 {

    private Object elementDate[];

    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public Object set (int index, Object obj) {
        rangeChack(index);
        Object oldValue = elementDate[index];
        elementDate[index] = obj;
        return oldValue;
    }

    public Object get (int index) {
        rangeChack(index);
        return elementDate[index];
    }

    public void remove (int index) {
        rangeChack(index);

        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementDate, index+1, elementDate,index, numMoved);
        }
        elementDate[--size] = null;

    }

    public void remove (Object obj) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(obj)) {
                remove(i);
            }
        }
    }

    private void rangeChack (int index) {
        if (index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public myarrylist01 () {
        this(10);
    }
    public myarrylist01 (int initialCapacity) {
        if (initialCapacity < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementDate = new Object[initialCapacity];
    }

    private void ensureCapacity () {
        if (size == elementDate.length){
            Object [] newArray = new Object[size*2 + 1];
            System.arraycopy(elementDate,0 ,newArray,0, elementDate.length);
            elementDate = newArray;
        }

    }

    public void add (Object obj) {
        //数组扩容
        ensureCapacity();
        elementDate[size++] = obj;
    }

    public static void main(String[] args) {
        myarrylist01 list = new myarrylist01();
        list.add("aaa");
        list.add(99);
        list.add(00);
        list.add("00");
        for (int i = 0; i < list.size; i++) {
            System.out.println(""+list.get(i));
        }


    }
}
