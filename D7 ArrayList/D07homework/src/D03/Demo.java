package D03;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(83);
        arrayList.add(72);
        arrayList.add(83);
        arrayList.add(83);
        arrayList.add(77);
        arrayList.add(75);
        arrayList.add(72);
        arrayList.add(72);
        arrayList.add(72);
        arrayList.add(67);
        arrayList.add(65);

        System.out.println("替换前"+arrayList);
        replace(arrayList,72,27);
        System.out.println("替换后"+arrayList);


    }
    public static int findIndex(List<Integer> list, int i){
        int index=0;
        for (int j=0;j<list.size();j++){
            if (list.get(j)==i){
                index=j;
                break;
            }
        }
        return index;
    }
    public static void replace(List<Integer> list, Integer oldValue, Integer newValue){
        for (int i=0;i<list.size();i++){

            if (list.get(i)== oldValue){
                list.set(i,newValue);
            }
        }
    }
}
