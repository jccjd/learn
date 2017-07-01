package Collection;

/**
 * 自己实现ArrayList，帮助我们更好理解ArrayList类的底层结构
 * Created by lenovo on 2017/6/30.
 */
public class MyArrayList {

    private  Object[] elementData;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEnpty() {
        return size == 0;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
        if (size == elementData.length) {

            Object[] newArray = new Object[size*2 + 1];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
//            for (int i = 0; i <elementData.length ; i++) {
//                newArray[i] = elementData[i];
//            }
        elementData = newArray;
        }
        elementData[size++] = object;
//        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //删除指定位置的对象
         int numMoved = size - index - 1;
         if (numMoved > 0) {
             System.arraycopy(elementData, index + 1, elementData, index, numMoved);
         }
         elementData[--size] = null; //

    }



    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(3);
        list.add("33");
        list.add("33");
        list.add("33");
        list.add("33");
        list.add("33");
        list.add("33");
        list.add("33");
        System.out.println(""+list.size());
        System.out.println(""+list.get(5));
    }
}
