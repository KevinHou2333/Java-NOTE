package tompeixun;

/**
 * 简单计算器
 * 功能：求和
 * v1.0求两个整数和
 *
 * code review 代码检查
 * 既然都是求和，为什么有两个名字呢，名字不一致，合适名
 * 能否优化吗？已经完成了功能，进行优化，锦上添花。
 *
 * 如果方法名和参数列表完全相同，认为是方法重复
 *
 * 方法相同的请夸下：
 *              只要参数不相同，方法就不认为相同（和顺序也没关系）
 *              （全称：方法重载）
 */
public class definateMethod {
    public static void main(String[] args) {

        getsum1(1,2);
       getSum2(5.1,6.2);
        System.out.println(getSum2(5.1,6.2));
    }

    //目前两个参数与运算两个数字值固定，不灵活
/*
    public static void getsum() {

        int num1 = 5;
        int num2 = 6;
        int sum = num2 + num1;
        System.out.println("sum is " + sum);


    }

 */
    //由外部传入需要计算的数字, 传入的数字我们称之为参数（int num1， int num2）
    public static void getsum1(int num1, int num2){

        int sum= num1+num2;

        System.out.println("sum is " + sum);

    }
//如果需要返回int类型的值，方法的返回值应该定义成int类型
    public  static int getSum2(int num1, int num2){


        int sum= num1+num2;

        return sum;//ruturn到meain方法,但是不会输出
    }

    public  static double getSum2(double num1, double num2){


        double sum= num1+num2;

        return sum;//ruturn到meain方法,但是不会输出
    }

    



}
