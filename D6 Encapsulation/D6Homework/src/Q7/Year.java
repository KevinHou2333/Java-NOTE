package Q7;

public class Year {
    public static void main(String[] args) {
       MyDate[] myDates= initData();
       printArray(myDates);
       System.out.println(isBi(myDates));
    }

    public static  void printArray(MyDate[] myDates){
        MyDate myDates1 = myDates[0];
        for (int i=0; i<myDates.length;i++){
            System.out.println(myDates[i].toString());
        }
    }


    public static String isBi(MyDate[] myDates) {


        MyDate myDates1 = myDates[0];

        String Bi =(myDates1.getYear()%4==0)?"这是闰年": "这不是闰年";

        return Bi;
    }


    public  static MyDate[] initData(){
        MyDate[] myDates = new MyDate[1];
        MyDate myDate = new MyDate(1990,1,1);
        myDates = new MyDate[]{myDate};
        return myDates;
    }

}
