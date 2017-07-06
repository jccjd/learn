package generic;

/**泛型接口 与泛型类 相似
 * Created by lenovo on 2017/7/6.
 */
public interface Comparator<T> {
    //全局常量
    int MAX_VALUE = 100;
    //公共的抽象方法
    abstract void test(T t);

}

//实现
class InterC1<A> implements Comparator{
    @Override
    public void test(Object o) {

    }
}
class InterC2<B> implements Comparator<Integer>{
    @Override
    public void test(Integer integer) {

    }
}
class InterC3<T,A> implements Comparator<T>{
    @Override
    public void test(T t) {

    }
}
