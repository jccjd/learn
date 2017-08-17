package singleton;

public class Client {
    public static void main(String[] args) {
        test1 s1 = test1.getInstance();
        test1 s2 = test1.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }

}
