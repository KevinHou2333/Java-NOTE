package Q03;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String big = scanner.nextLine();
    String small = scanner.nextLine();
    show(big,small);

    }
    public static int show(String big, String small){
        int count =0;
        int index=0;
        while ((index =big.indexOf(small,index))!=-1){
                index++;
                count++;
                System.out.println(count);
        }
        return count;
    }
}
