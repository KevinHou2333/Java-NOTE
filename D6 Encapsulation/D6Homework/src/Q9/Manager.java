package Q9;

public class Manager {
    private String name;
    private int number;
    private double salary;
    private double reward;
    public Manager(String name,int number,double salary,double reward){
        setName(name);
        setNumber(number);
        setSalary(salary);
        setReward(reward);
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

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public void intro(){
        System.out.println("经理员姓名: "+getName());
        System.out.println("经理工号: "+getNumber());
    }

    public void showSalary(){
        String bonus = null;
        if (reward==0.0){
            bonus="无";
        }
        System.out.println("基本工资: "+getSalary()+"奖金: "+ bonus);
    }
    public void work(){
        System.out.println("正在努力作者管理工作，分配认为，检察员工提交上来的代码");
    }

}
