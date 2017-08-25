package factory.bridge;

public class Client {
    public static void main(String[] args) {
        Computer2 computer = new Laptop2(new Lenovo());
        computer.sale();
    }
}
