package factory.prototype;


import java.util.Date;

/**
 * 深复制
 * */
public class Sheep2 implements Cloneable{//克隆羊1997

    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();//直接调用Object对象的clone方法

        /*添加如下代码实现深克隆(deep clone)*/
        Sheep2 s = (Sheep2) object;
        s.birthday = (Date) this.birthday.clone();//把属性也克隆
        return object;
    }

    public Sheep2(String name, Date birthday) {
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
