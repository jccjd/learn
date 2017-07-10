package otherthree;

import java.util.EnumMap;

/**
 * EnumMap要求键为枚举
 * Created by lenovo on 2017/7/10.
 */
public class EnumMapDema {
    public static void main(String[] args) {
        EnumMap<Season,String> map = new EnumMap<Season, String>(Season.class);
        map.put(Season.SPRING,"春困");
        map.put(Season.SUMMER,"sdsss");
        map.put(Season.AUTUMN,"sdss");
        map.put(Season.WINTER,"ssds");
        System.out.println(""+map.size());

    }
}
enum Season {
    SPRING,SUMMER,AUTUMN,WINTER;
}