package staticDemo;

public class Student {
    private String name;
    private int id;
    public static int numberOfStudent;

    public Student(String name, int id) {
        numberOfStudent++;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println("学生姓名"+this.name+"学生学号"+this.id+"学生人数"+numberOfStudent);
    }
    public static void shownumberOfStudent(){
        System.out.println(numberOfStudent);
    }
}
