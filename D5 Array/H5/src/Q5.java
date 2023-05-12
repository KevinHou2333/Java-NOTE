public class Q5 {
    public static void main(String[] args) {

        int[] array={95, 92, 75, 56, 98, 71, 80, 58, 91, 91};

        getAvg(array);
    }

    public static int getAvg(int[] array){

        int sum=0;
        int term=0;
        int average=0;
        int term2 = 0;
        for(int i=0;i<array.length;i++){

            sum+=array[i];

            term+=1;

            average=sum/term;

        }

        int num = 0;
        for (int i=0;i<array.length;i++){

            if (array[i]>average){
                num+=1;

            }

        }

        System.out.println("高于平均分有: "+average+" 的数有"+num+"个");









        return 0;
    }
}
