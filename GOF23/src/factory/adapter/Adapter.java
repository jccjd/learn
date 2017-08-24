package factory.adapter;

/**
 * 适配器(类适配器方式）
 *
 *
 * */

public class Adapter extends Adaptee implements Tagter{

    @Override
    public void handleReq() {
        super.requset();
    }
}
