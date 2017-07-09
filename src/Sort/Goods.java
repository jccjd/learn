package Sort;

/**
 * Created by lenovo on 2017/7/9.
 */
public class Goods {

    private String name;
    private double price;
    private int fav;

    public Goods(String name, double price, int fav) {
        this.name = name;
        this.price = price;
        this.fav = fav;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFav() {
        return fav;
    }

    public void setFav(int fav) {
        this.fav = fav;
    }

    @Override
    public String toString() {
        return "商品名"+name+"收藏量"+fav+"价格"+price+"\n";
    }
}
