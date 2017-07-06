package generic;

/**
 * Created by lenovo on 2017/7/6.
 */
public class Student<T> {
   T score;

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }
}
