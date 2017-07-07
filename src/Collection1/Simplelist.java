package Collection1;

/**
 * 理解迭代器的原理
 *
 * Created by lenovo on 2017/7/7.
 */
public class Simplelist {
    //数组存储
    private String elem[] = {"a","b","c",};
    //大小
    private int size =elem.length;
    //计数器 -->指针 游标
    private int coursor = -1;

    //判断是否有下一个
    public boolean hasNext() {
        return coursor + 1 < size;
    }

    public int size() {
        return size =elem.length;
    }
//    获取下一个
    public String Next() {
        coursor++;
        return elem[coursor];
    }
//    删除下一个
    public void remove() {
        //移动数组元素
        System.arraycopy(elem, coursor+1, elem, coursor, this.size-(coursor+1));
        //实际大小减一
        this.size--;
        //游标回退一步
        this.coursor--;
    }
    public static void main(String[] args) {
        Simplelist list = new Simplelist();
       if (list.hasNext()) {
           System.out.println(""+list.Next());

       }
       if (list.hasNext()) {
           System.out.println(""+list.Next());

       }
       if (list.hasNext()) {
           System.out.println(""+list.Next());

       }
       if (list.hasNext()) {
           list.remove();
           System.out.println(""+list.Next());

       }
        System.out.println(""+list.size());
       list = new Simplelist();
       while (list.hasNext()) {
           System.out.println(""+list.Next());
       }
    }
}
