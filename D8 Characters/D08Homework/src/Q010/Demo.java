package Q010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入循环几次");
        int number = scanner.nextInt();
        ArrayList<Information> list = collection(number);
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(compare(list));
    }

    public static ArrayList<Information> collection(int number) {
        ArrayList<Information> list = new ArrayList<>();//声明list
        Scanner scanner = new Scanner(System.in);
        int x = 0;
       while (number > x) {
           String username = scanner.nextLine();
           String password = scanner.nextLine();
           list.add(new Information(username, password));
           x++;
       }
        return list;
    }
    public static boolean compare(ArrayList<Information> list){
        Scanner scanner =new Scanner(System.in);
        String password = scanner.nextLine();
        String username = scanner.nextLine();
        boolean a = false;

       for(int i=0;i<list.size();i++){
           if (username.equals(list.get(i).getUsername())&&password.equals(list.get(i).getPassword())){
               a= true;
           }else {
               a=false;

           }
       }
        //return username.equals(list.get(i).getUsername())&&password.equals(list.get(i).getPassword())
        return a;

       //if(!compare（）)
    }
}
