package Q02;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        start(num);
    }
    public static void start(String num){
        char[] a = num.toCharArray();
        for (int i=0; i< a.length;i++) {
            if (a[0]!='0'){
                System.out.println("这个QQ是否正确：true");
            }else{
                System.out.println("这个QQ是否正确：false");
            }
        }
    }
}