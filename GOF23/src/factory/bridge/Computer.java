package factory.bridge;

public interface Computer {
    void sale();
}

class Desktop implements Computer {

    @Override
    public void sale() {
        System.out.println("Desktop");
    }
}
class Laptop implements Computer {

    @Override
    public void sale() {
        System.out.println("Laptop");
    }
}
class Pad implements Computer {

    @Override
    public void sale() {
        System.out.println("pad");
    }
}
class lenovoDesktop extends Desktop {

    @Override
    public void sale() {
        System.out.println("lenovoDesktop");
    }
}
class lenovoLaptop extends Laptop {

    @Override
    public void sale() {
        System.out.println("lenovoLaptop");
    }
}
class lenovoPap extends Pad {

    @Override
    public void sale() {
        System.out.println("lenovopad");
    }
}
class DellDesktop extends Desktop {

    @Override
    public void sale() {
        System.out.println("DellDesktop");
    }
}
class DellLaptop extends Laptop {

    @Override
    public void sale() {
        System.out.println("DellLaptop");
    }
}
class DellPap extends Pad {

    @Override
    public void sale() {
        System.out.println("Dellpad");
    }
}class shenzhouDesktop extends Desktop {

    @Override
    public void sale() {
        System.out.println("shenzhouDesktop");
    }
}
class shenzhouLaptop extends Laptop {

    @Override
    public void sale() {
        System.out.println("shenzhouLaptop");
    }
}
class shenzhouPap extends Pad {

    @Override
    public void sale() {
        System.out.println("shenzhoupad");
    }
}
