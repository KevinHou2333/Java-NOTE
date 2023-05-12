package staticDemo;

public class Demo01 {
    public static void main(String[] args) {
        //老师统计学生人数，第几个学生，学号就是几
        //比如来了一个学生，这个学生号就是1
        //比如来了一个学生，这个学生号就是2
        //.....

        //人数属性不属于某一个学生，公共的信息

        Student student = new Student("Tom",1);
        student.show();
        Student student1 = new Student("Tos",2);
        student1.show();

        Student.shownumberOfStudent();

    }
}
