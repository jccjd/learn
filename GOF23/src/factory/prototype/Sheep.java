package factory.prototype;


import java.io.Serializable;
import java.util.Date;
/**
 * 浅复制
 * */
public class Sheep implements Cloneable, Serializable{//克隆羊1997

    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();//直接调用Object对象的clone方法


        return object;
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
