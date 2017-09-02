package factory.composite;

/**
 * 抽象构建
 * */
public interface AbstractFile {
    void killVirus();
}
class ImageFile implements AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("");
    }
}