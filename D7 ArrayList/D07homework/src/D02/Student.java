package D02;

public class Student {
    private String name;
    private int age;
    private String information;

    public Student() {
    }

    public Student(String name, int age, String information) {
        this.name = name;
        this.age = age;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", information='" + information + '\'' +
                '}';
    }
}
