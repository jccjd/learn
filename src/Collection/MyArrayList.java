package Collection;

/**
 * 自己实现ArrayList，帮助我们更好理解ArrayList类的底层结构
 * Created by lenovo on 2017/6/30.
 */
public class MyArrayList {

    private static Object[] elementData;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEnpty() {
        return size == 0;
    }

    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    public MyArrayList(){
        this(10);
    }

    public  MyArrayList(int initialCapacity) {
        if (initialCapacity < 0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
    }

    public void add(Object object) {
        //数组扩容和数据拷贝
        ensureCapacity();
        elementData[size++] = object;
//        size++;
    }

    public void remove(int index) {
        rangeCheck(index);
        //删除指定位置的对象
         int numMoved = size - index - 1;
         if (numMoved > 0) {
             System.arraycopy(elementData, index + 1, elementData, index, numMoved);
         }
         elementData[--size] = null; //
    }

    public void remove (Object obj) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(obj)) {   //底层方法调用equals而不是==,equals是比较值相等
                remove(i);
            }
        }
    }

    public Object set(int index, Object obj) {
        rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = obj;
        return oldValue;
    }

    public void add (int index, Object obj) {
        rangeCheck(index);
        ensureCapacity();       //数组扩容
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = obj;
        size++;
    }

    private void ensureCapacity () {
        //数组扩容与拷贝
        if (size == elementData.length) {
            Object[] newArray = new Object[size*2 + 1];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
//            for (int i = 0; i <elementData.length ; i++) {
//                newArray[i] = elementData[i];
//            }
            elementData = newArray;
        }
    }


    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(3);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add(0,"7");
        list.set(2,"aa");
        list.remove(2);
        list.remove("3");
        for (int i = 0; i < list.size; i++) {
            System.out.println(""+list.get(i));
        }
    }
}
