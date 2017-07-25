package annotation;


@myTable("tb_student")
public class mystudent {
    @myField(columnName = "id", type = "int", length = 10)
    private int id;
    @myField(columnName = "sname", type = "varchar", length = 10)
    private String name;
    @myField(columnName = "age", type = "int", length = 3)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
