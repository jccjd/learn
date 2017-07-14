package Thread;

/**
 * 静态代理 设计模式
 * 1.真实角色
 * 2.代理角色:持有真实角色的引用
 * 3.二者 实现相同的接口
 * Created by lenovo on 2017/7/14.
 */
public class StaticProxy {
    public static void main(String[] args) {
        Marry you = new You();
        WeddingCompany company = new WeddingCompany(you);
        company.marry();
    }

}
interface Marry {
    void marry();
}
class You implements Marry {
    @Override
    public void marry() {
        System.out.println("sss");
    }
}
//代理角色
class WeddingCompany implements Marry {
    Marry you;
    public WeddingCompany() {

    }
    public WeddingCompany(Marry you) {
        this.you = you;
    }
    private void before() {
        System.out.println("ddd");
    }
    private void after() {
        System.out.println("dddss");
    }

    @Override
    public void marry() {
        before();
        you.marry();
        after();

    }
}
