package Q01;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    String word = scanner.next();
    System.out.println("录入字符串为"+word);
    String b = reverseChar(word);
    System.out.println("相反字符串为"+b);
    }
    public static String reverseChar(String str){
        String word= "";
        char[] chars= str.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
            word +=chars[i];
        }

        return word;
    }
}
