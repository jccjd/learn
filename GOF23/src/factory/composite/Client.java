package factory.composite;

public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4;
        Folder f1 = new Folder("我的收藏");
        f3 = new ImageFile("头像.jpg");

        f1.add(f3);
        f3.killVirus();
        f1.killVirus();
    }
}
