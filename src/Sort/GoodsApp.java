package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lenovo on 2017/7/9.
 */
public class GoodsApp {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();
        list.add(new Goods("ss2",224,22));
        list.add(new Goods("ss1",232,23));
        list.add(new Goods("ss2",222,2111));
        Collections.sort(list,new GoodsPriceComp());
        System.out.println(""+list);
    }
}
