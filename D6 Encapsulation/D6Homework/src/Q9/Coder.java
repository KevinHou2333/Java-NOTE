package Q9;

public class Coder {
    private String name;
    private int number;
    private double salary;

    public Coder(String name, int number,double salary){
        setName(name);
        setNumber(number);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void intro(){
        System.out.println("程序员姓名: "+getName());
        System.out.println("程序员工号: "+getNumber());
    }

    public void showSalary(){
        System.out.println("程序员工资: "+getSalary());
    }
    public void work(){
        System.out.println("正在努力写代码");
    }

}
