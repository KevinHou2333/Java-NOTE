package Q008;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate(){
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        String c = scanner.next();
        int b = scanner.nextInt();


        if (c.equals("+")){
            int d= a+b;
            System.out.println(a+"+"+b +"="+d);
        }else if (c.equals("-")){
            int d= a-b;
            System.out.println(a+"-"+b +"="+d );
        }else if (c.equals("*")){
            int d= a*b;
            System.out.println(a+"*"+b +"="+d);
        }else if (c.equals("/")){
            int d= a/b;
            System.out.println(a+"/"+b +"="+d);
        }else if (c.equals("%")){
            int d= a%b;
            System.out.println(a+"%"+b +"="+d);
        }else {
            System.out.println("null");
        }


    }
}
