package factory.abstractFcatory;

public interface Engine {
    void run();
    void start();
}
class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("好引擎 跑得快");
    }

    @Override
    public void start() {
        System.out.println("好引擎 启动快");
    }
}
class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("差引擎 跑得慢");
    }

    @Override
    public void start() {
        System.out.println("差引擎 启动慢");
    }
}
