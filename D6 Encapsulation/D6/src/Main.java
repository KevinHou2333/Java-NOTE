/**
 * 新增功能
 * <p>
 * 需求分析：
 * 1，数据源:
 * 应发工资总和， 平均工资，员工列表
 * 员工数据
 * double array工资列表，使用到数据
 * 什么类型[]array--------既然是员工列表，那么这里的类型是员工类型
 * 2，数据源处理:
 * <p>
 * 3，结果显示:
 */

public class Main {
    public static void main(String[] args) {

        initData();
        //人事Hr 手动天蝎员工姓名，工号，薪资，爸新增员工对象添加到列表当中
        //创建一个新的员工对象

    }

    public static void initData() {
        //员工数据

        Employee[] array = new Employee[3];//员工数组

        //array[0]=员工对象，员工实例 object instance
        //员工1

        array[0] = new  Employee("Tom",2,8000);
        //employee1.setName("Tom");//可以通过.号访问对象的成员变量
        //employee1.setNumber(2);
        //employee1.setSalary(8000);
        //array[0] = employee1;//具体对象

        //员工2

        array[1] = new Employee("Kevin",3,10000);
       // employee2.setName("Kevin");
       // employee2.setNumber(3);
       // employee2.setSalary(10000);
        //array[1] = employee2;

        //员工3

        array[2] = new Employee("Jason",4,13000);
       // array[2] = employee3;//new类名
        //employee3.setName("Jason");
        //employee3.setNumber(4);
       // employee3.setSalary(13000);



        // System.out.println(array[0]);// 16进制，Employee@2f92e0f4

        System.out.println(array[0].getName());
        System.out.println(array[0].getNumber());
        System.out.println(array[0].getSalary());
        System.out.println("----------");
        System.out.println(array[1].getName());
        System.out.println(array[1].getNumber());
        System.out.println(array[1].getSalary());
        System.out.println("----------");
        System.out.println(array[2].getName());
        System.out.println(array[2].getNumber());
        System.out.println(array[2].getSalary());
        System.out.println();




        //bug该怎么处理

    }



}