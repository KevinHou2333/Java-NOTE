import java.util.TooManyListenersException;

//完成需求
public class Demo02 {
    public static void main(String[] args) {
        //主要统计应发工资总额，最高工资，平均工资
        //能打印出员工列表，最高工资，员工姓名+工号
        //创建一个员工对象
        Employee[] employees = initData();
        System.out.println("------------------");
        printEmployeeList(employees);
        System.out.println("-----------------");
        System.out.println("总工资: "+totalSalary(employees));
        System.out.println("--------------------");
        System.out.println("平均工资: "+averageSalary(employees));
        System.out.println("---------------------");
        System.out.println("最高工资: "+maxSalary(employees));
    }

    //打印员工列表
    public static void printEmployeeList(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];

            System.out.println("员工姓名: " + employee.getName() + "工号: " + employee.getNumber() + "工资: " + employee.getSalary());

        }

    }

    public static double totalSalary(Employee[] employees) {
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum += employee.getSalary();
        }
        return sum;
    }

    public static double averageSalary(Employee[] employees) {
        double average = 0.0;
        average = totalSalary(employees) / employees.length;
        return average;
    }

    public static double maxSalary(Employee[] employees) {
        double max = 0.0;

        for (int i = 0; i < employees.length; i++) {

            Employee employee = employees[i];

            if (employee.getSalary() > max) {
                double temp =0.0;
                max= employee.getSalary();
               temp= employee.getSalary() ;
               temp =max;
            }
        }

    return max;
    }

    public static  Employee[] initData(){
        Employee[] employees = new Employee[3];
        Employee employee1= new Employee("Tom",1,8000);
        Employee employee2= new Employee("Kevin",2,10000);
        Employee employee3= new Employee("Lucas",3,5000);
        Employee[] employees1 =new Employee[]{employee1,employee2,employee3};

        return employees1;
    }
}
