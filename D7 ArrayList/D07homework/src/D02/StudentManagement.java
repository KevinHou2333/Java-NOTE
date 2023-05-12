package D02;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public ArrayList<Student> studentManager = new ArrayList<>();//new一个新的list

    public StudentManagement() {
        this.studentManager = new ArrayList<>();
    }//构建函数

    public ArrayList<Student> getStudentManager() {
        return studentManager;
    }

    public void setStudentManager(ArrayList<Student> studentManager) {
        this.studentManager = studentManager;
    }//oop

    public void add(){
         String name = " ";
         int age = 0;
         String information= "";

        Student student = new Student();//Student类
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        name= scanner.nextLine();
        System.out.println("请输入年龄");
        age= scanner.nextInt();
        System.out.println("输入信息");
        information = scanner.nextLine();

        studentManager.add(new Student(name,age,information));//加入student类李

    }
    public void print(){
        for (int i=0;i<studentManager.size();i++){
            System.out.println(studentManager.get(i).toString());//打印
        }
    }
}
