package arraysDemo;
import  java.util.ArrayList;
import java.util.Arrays;

public class Demo1
{
    public static void main(String[] args) {
        int[] ints={1,8,5,7};
        Arrays.sort(ints);//生序
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.binarySearch(ints,8));//二分查找（先排序）


    }
}
