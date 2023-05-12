package D05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
    ArrayList<Integer> arrayList = getScoreList();
        countScore(arrayList);

    }
    public static ArrayList<Integer> getScoreList(){
      ArrayList<Integer> arrayList = new ArrayList<>();
        Random r = new Random();
        for (int i=0;i<49;i++){
            int score = r.nextInt(0,101);
            arrayList.add((Integer)score);
        }
        return arrayList;
    }

    public static void countScore(List<Integer> list){

        int a=0,b=0,c=0,d=0;
        for (int i=0; i<list.size();i++){
            if (list.get(i)<=100&&list.get(i)>=80){
                a+=1;
            }else  if (list.get(i)<=79&&list.get(i)>=60){
                b+=1;
            }else  if (list.get(i)<=59&&list.get(i)>=40){
                c+=1;
            }else  if (list.get(i)<=39&&list.get(i)>=0){
                d+=1;

            }

        }
        System.out.println("100分--80分："+a+"人");
        System.out.println("79分--60分："+b+"人");
        System.out.println("59分--40分："+c+"人");
        System.out.println("79分--60分："+d+"人");

    }


}

