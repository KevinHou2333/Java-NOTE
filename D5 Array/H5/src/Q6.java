public class Q6 {
    public static void main(String[] args) {

        int[] array1={1,2,3,4,3,2,1};
        int[] array2={1,2,3,5,4,3,1};
        sym(array1);
        sym(array2);

        int[] array3={1,2,3,4,3,2,1};
        int[] array4={1,2,3,4,3,2,1};

        equal(array3,array4);

        System.out.println(equal(array3,array4));

    }

    public static void sym(int[] array){

        boolean result=false;

        for(int i=0;i< array.length/2;i++){


            if(array[i]==array[array.length-1-i]){

                                result=true;

            }else {

                result=false;

            }

        }

        System.out.println(result);

    }

    public static boolean equal(int[] array1,int[] array2){
        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]){

                return false;
            }
        }
        return true;


    }


}
