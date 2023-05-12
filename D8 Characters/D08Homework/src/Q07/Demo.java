package Q07;

import java.util.Scanner;

public class Demo  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(judge(word));
        
    }
    public static boolean judge(String word){
        char[] a=word.toCharArray();
        boolean b =false;
       for (int i=0;i< a.length;i++){
           b=(a[0]== a[a.length-1])? true:false;

       }
        return b;
    }
}
