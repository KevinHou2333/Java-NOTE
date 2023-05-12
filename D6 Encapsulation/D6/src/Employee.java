/**
 *员工类
 */

public class Employee {
    private String name;//成员变量,默认是null
    private int number;//默认0
    private double salary;//默认0.0



    public Employee(String name,int number,double salary){
        setName(name);
        setNumber(number);
        setSalary(salary);

    }
    public void setName(String name){
        this.name=name;//this表示指代当前的对象
    }

    //通过getName调用成员变量name的值
    public String getName(){
        return name;
    }
    public void setNumber(int number){
        if (number>0){
            this.number= number;
        }else if(number<0){
            System.out.println("error");
        }

    }
    public int getNumber(){
        return number;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){return salary;}


}
