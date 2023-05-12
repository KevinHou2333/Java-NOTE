package staticDemo;

import java.util.ArrayList;

public class Game {
   static int num;
    static ArrayList<String>arrayList;
    public static void main(String[] args) {
        //代码块
    }
    static {
        num=2;
        arrayList= new ArrayList<>();
        arrayList.add("张三");
        arrayList.add(" TOM");
    }
}
