package Collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/**
 * 使用泛型可以操作多个类型
 *
 *
 * Created by lenovo on 2017/7/7.
 */
public class MyArrayFinal<E> implements java.lang.Iterable<E>{
    //数组存储
    private Object elem[] = new Object[5];
    //实际大小
    private int size = 0;
    //计数器 -->指针 游标
    private int coursor = -1;

//    在末尾添加元素


    public void add(E str) {
        if (this.size == elem.length) { //容量不足 --> 扩容
            elem = Arrays.copyOf(elem,elem.length*2+1);
        }

        elem[size] = str;//数组中加入元素 最后
        size++;//实际大小加一
    }
    private class MyIterator implements Iterator {
        //判断是否有下一个
        public boolean hasNext() {
            return coursor + 1 < size;
        }

        public int size() {
            return size = elem.length;
        }

        //    获取下一个
        public E next() {
            coursor++;
            return (E) elem[coursor];
        }

        //    删除下一个
        public void remove() {
            //移动数组元素
            System.arraycopy(elem, coursor + 1, elem, coursor,/*可省略DeepList.this.*/size - (coursor + 1));
            //实际大小减一
           /*可省略DeepList.this.*/
            size--;
            //游标回退一步
           /*可省略DeepList.this.*/
            coursor--;
        }
    }


    public Iterator iterator1() {
        return new MyIterator();
    }


    //使用了内部类实现
    public Iterator iterator2() {
        class MyIterator implements Iterator {
            //判断是否有下一个
            public boolean hasNext() {
                return coursor + 1 < size;
            }

            public int size() {
                return size = elem.length;
            }

            //    获取下一个
            public E next() {
                coursor++;
                return (E) elem[coursor];
            }

            //    删除下一个
            public void remove() {
                //移动数组元素
                System.arraycopy(elem, coursor + 1, elem, coursor,/*可省略DeepList.this.*/size - (coursor + 1));
                //实际大小减一
           /*可省略DeepList.this.*/
                size--;
                //游标回退一步
           /*可省略DeepList.this.*/
                coursor--;
            }
        }
        return new MyIterator();
    }

    //使用匿名内部类实现
    public Iterator<E> iterator() {
        return new Iterator<E>() { //创建Iterator迭代器接口 实现类（匿名）的对象

            //判断是否有下一个
            public boolean hasNext() {
                return coursor + 1 < size;
            }

            public int size() {
                return size = elem.length;
            }

            //    获取下一个
            public E next() {
                coursor++;
                return (E) elem[coursor];
            }

            //    删除下一个
            public void remove() {
                //移动数组元素
                System.arraycopy(elem, coursor + 1, elem, coursor,/*可省略DeepList.this.*/size - (coursor + 1));
                //实际大小减一
           /*可省略DeepList.this.*/
                size--;
                //游标回退一步
           /*可省略DeepList.this.*/
                coursor--;
            }
        };
    }

    public static void main(String[] args) {
        MyArrayFinal<Integer> list = new MyArrayFinal<Integer>();
        list.add(1);// int-->Integer 自动装箱
        list.add(2);// int-->Integer 自动装箱
        list.add(3);// int-->Integer 自动装箱
        for (Integer e:list) {
            System.out.println(""+e);
        }
        System.out.println("————————————————");
        MyArrayFinal<String> list1 = new MyArrayFinal<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        for (String a:list1) {
            System.out.println(""+a);
        }
        System.out.println("————————————————");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(""+e);
        }
    }
}