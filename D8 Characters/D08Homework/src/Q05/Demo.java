package Q05;

public class Demo {
    public static void main(String[] args) {
    double a= Math.random();
    random(a);
    }
    public static void random(double a){
        System.out.println("随机数为："+a);

        System.out.println("改变的数为: ");
        System.out.println(String.format("%.2f",a));

    }
}
