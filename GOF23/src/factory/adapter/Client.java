package factory.adapter;

/**
 *
 * */

public class Client {
    public void test1(Tagter tagter) {
        tagter.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
//        Tagter tagter = new Adapter();
        Tagter tagter = new Adapter2(adaptee);
        client.test1(tagter);
    }
}
