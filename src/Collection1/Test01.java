package Collection1;




import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/7/6.
 */
public class Test01 {

    public static void main(String[] args) throws Exception{
        Employee employee = new Employee(12,"ss",123,"as","2007-12");
        Employee employee1 = new Employee(12,"ss",123,"as","2007-12");
        Employee employee2 = new Employee(12,"ss",123,"as","2007-12");
//        employee.setDepartment("总统");
//        employee.setId(0001);
//        employee.setName("习近平");
//        employee.setSalary(100);
//        //字符串转时间
//        String strDate = "2009-10";
//       DateFormat format = new SimpleDateFormat("yyyy-MM");
//        employee.setHireDate(format.parse(strDate));
        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        print(list);
    }
    public static void print(List<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(""+list.get(i).getName());
        }
    }

}
