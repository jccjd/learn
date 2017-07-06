package generic;

/**泛型父类
 * 1，保留父类的泛型 --> 泛型子类
 * 2，不保留父类的泛型 --> 按需实现
 *
 *
 * 3,子类重写的方法类型 --> 随父类而定
 *
 *      1,属性及方法的类型 --> 随位置而定
 *      2,子类中使用父类的属性 --> 随父类而定
 *      3,子类中定义的属性 --> 随子类而定
 *      4,子类新增方法 -->随子类而定
 * Created by lenovo on 2017/7/6.
 */
public abstract class Father<T1,T2> {
    T1 age;
    abstract void test(T2 name);

}
// 1,保留 -->泛型子类
//      1,全部保留

class C1<T1,T2,A,B> extends Father<T1,T2>{
    A Sex;
    @Override
    void test(T2 name) {
//        this.age -->T1类型
    }
}

//      2,部分保留

class C2<T2,A,B> extends Father<Integer,T2>{
    @Override
    void test(T2 name) {
//        this.age --Integer类型
    }
}

// 2,不保留 -->按需实现
//      1,具体类型

class C3/*<A,B>*/ extends Father<Integer,String>{
    @Override
    void test(String name) {
//        this.age --Integer类型
    }
}

//      2,没有类型，擦除Object

class C4/*<A,B>*/ extends Father{
    @Override
    void test(Object name) {
//        this.age -->Object 类型
    }
}