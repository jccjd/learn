package Sort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lenovo on 2017/7/9.
 */
public class NewsItem implements java.lang.Comparable<NewsItem>{
    private String tile;
    private Date time;
    private int hits;

    public NewsItem(String tile, Date time, int hits) {
        super();
        this.tile = tile;
        this.time = time;
        this.hits = hits;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Override
    public int compareTo(NewsItem o) {
        int result = 0;
        result = - this.time.compareTo(o.time);
        if (result == 0) {
            result = -(this.hits - o.hits) ;
            if (result == 0) {
                result = - this.tile.compareTo(o.tile);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("标题").append(this.tile);
        sb.append("日期").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.time));
        sb.append("点击量").append(this.hits).append("\n");
        return sb.toString();
    }
}
