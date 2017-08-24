package factory.adapter;

/**
 * 适配器(对象适配器方式 ,使用了组合的方式跟适配对象整合)
 * 
 *
 * */

public class Adapter2 implements Tagter{

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.requset();
    }
}
