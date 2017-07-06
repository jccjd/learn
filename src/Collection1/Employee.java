package Collection1;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/6.
 */
public class Employee {
    private int id;
    private String name;
    private int salary;
    private String department;
    private String hireDate;


    public Employee(int id, String name, int salary, String department, String hireDate) {
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.hireDate = hireDate;
    }
    public Employee() {

    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String  hireDate) {
        this.hireDate = hireDate;
    }
}
