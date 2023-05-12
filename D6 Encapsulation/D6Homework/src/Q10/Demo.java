package Q10;

public class Demo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("周老师",30,"java面向对象知识");
        teacher.eat();
        teacher.study();
        Student student = new Student("韩同学", 18, "java面向对象知识");
        student.eat();
        student.study();
    }

}
