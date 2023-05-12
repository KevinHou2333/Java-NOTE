package Q06;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.println("源字符串：");
        String[] d = input();//输入的类
        System.out.println(add(d));//将类加入list中
        ArrayList<String> list = new ArrayList<>();//创建个新list
        list = add(d);//把数组加入list当中
        System.out.println("删除后");
        //remove(list);
        System.out.println(remove(list));


    }

    public static String[] input() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//创建几个
        String d = " ";
        String[] b = new String[a];//数组里含几个变量
        for (int c = 0; c < b.length; c++) {
            d = scanner.next();//输入变量值
            b[c] = d;
        }
        return b;
    }

    public static ArrayList<String> add(String[] b) {

        /**
         * 加入数组方法
         */
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            list.add(b[i]);

        }
        return list;
    }

    public static ArrayList<String> remove(ArrayList<String> b) {
        /**
         * 移除变量方法
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("要删除几个变量");//要删除几个类
        int d = scanner.nextInt();//变量的个数

        //while (0< d ) {//删除的的数量要大于一才能执行

        if (d > b.size()) {//删除的数不能大于list的size
            System.out.println("类不够");
            //break;
        } else if (d < b.size()) {

            for (int i = 0; i < d; i++) {
                int a = scanner.nextInt();//输入要删除的变量的位置
                b.remove(a - 1);

            }
            //break;

        }
        //break;

        return b;
    }
}
