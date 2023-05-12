package D02;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1.输入信息\n"+"2.显示信息\n"+"0.退出");
            int code= scanner.nextInt();
            switch (code){
                case 1:
                    System.out.println("录入信息");
                    studentManagement.add();//运用add类
                    break;
                case 2:
                    System.out.println("录入完毕");//输出
                    studentManagement.print();
                case 0:
                    System.out.println("退出");
                    return;


            }
        }

    }
}
