package Reflection;

public class User {
    private String uname;
    private int age;
    private int id;

    public User() {
    }

    public User(String uname, int age, int id) {
        this.uname = uname;
        this.age = age;
        this.id = id;
    }

    public String getUname() {

        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
