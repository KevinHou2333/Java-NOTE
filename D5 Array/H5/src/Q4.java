import java.util.*;
public class Q4 {

    public static void main(String[] args) {
        char[] word={'a','l','f','m','f','o','b','b','s','n'};

        printCount(word);
    }

    public static void printCount(char[] word){

        Arrays.sort(word);
        for (int i=0;i< word.length;i++){

            if(word[i]=='b'||word[i]=='f'){

                System.out.println(word[i]+"2");

            }else {

                System.out.println(word[i]+"1");

            }


        }

    }
}
