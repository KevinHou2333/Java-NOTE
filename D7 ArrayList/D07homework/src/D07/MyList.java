package D07;

import java.util.ArrayList;

public class MyList {
    ArrayList<Integer> element = new ArrayList<>();

    public void add(Integer I){
        element.add(I);
    }
    public Integer remove(){
        Integer remove = element.remove(element.size()-1);
        return remove;
    }
    public void show(){
        System.out.println(element);
    }

}
