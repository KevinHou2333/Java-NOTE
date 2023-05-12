package D04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getNumlist();
        printCount(arrayList);
        }

    public static ArrayList<Integer> getNumlist(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<100;i++){
            int x = r.nextInt(0,11);
            arrayList.add(x);
        }

        return arrayList;
    }
    public static void printCount(ArrayList<Integer> list){

        int[] count= new int[10];

        for (int num=0;num<list.size();num++){
            int n= list.get(num);
           count[n-1]++;
           for (int i=0;i<count.length;i++){

               System.out.println("数字："+(i+1)+"---"+count[i]+"次");
           }
            for (int i=0;i<count.length;i++){
                System.out.println("数字："+(i+1)+"---"+count[i]+"次");
            }
        }

    }
}
