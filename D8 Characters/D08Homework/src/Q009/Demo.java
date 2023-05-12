package Q009;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    String word = scanner.next();
    System.out.println(check(word));
    }

    public static boolean check(String password) {

        char[] a = password.toCharArray();
        boolean isOK = true;

        if (password.length() ==8) {
            isOK = true;

        if (password.split("\\p{javaUpperCase}").length <= 2) {
            for (int i = 0; i < a.length; i++) {
                if (Character.isAlphabetic(a[i]) || Character.isDigit(a[i])) {
                    isOK = true;

                }
                else {
                    isOK = false;
                }
            }
        }
        }else {
            isOK= false;
        }
        return isOK;
    }

}