package Collection1;

import java.util.Iterator;

/**
 * 深入理解迭代器的原理 --》一个容器可以创建多个迭代器对象
 *
 * Created by lenovo on 2017/7/7.
 */
public class DeepList {
    //数组存储
    private String elem[] = {"a", "b", "c",};
    //大小
    private int size = elem.length;
    //计数器 -->指针 游标
    private int coursor = -1;

    private class MyIterator implements Iterator {
        //判断是否有下一个
        public boolean hasNext() {
            return coursor + 1 < size;
        }

        public int size() {
            return size = elem.length;
        }

        //    获取下一个
        public String next() {
            coursor++;
            return elem[coursor];
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
            public String next() {
                coursor++;
                return elem[coursor];
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
    public Iterator iterator() {
        return new Iterator() { //创建Iterator迭代器接口 实现类（匿名）的对象

                //判断是否有下一个
                public boolean hasNext() {
                    return coursor + 1 < size;
                }

                public int size() {
                    return size = elem.length;
                }

                //    获取下一个
                public String next() {
                    coursor++;
                    return elem[coursor];
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
        DeepList list = new DeepList();
        Iterator it = list.iterator2();
        while (it.hasNext()) {
            System.out.println("" + it.next());
        }
        System.out.println("*********");
        it = list.iterator2();
        while (it.hasNext()) {
            System.out.println("" + it.next());
        }
    }
}
