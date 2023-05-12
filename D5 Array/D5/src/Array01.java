
/**
 * 数组：
 *      一组数据
 * 1,声明数组：
 *     格式：数组类型[] 变量名= new 数据类型[元素个数];
 *     注意:A,数组可以认为是容器或者是箱子， 数组哪呗的元素类型是相同
 *         B,数组类型必须声明长度，也就是元素个数是确定的
 *         C,数组占内存也是肯定的，每一个元素如果没有复制，则为该类型的默认值，double默认值是0.0
 *          double[] salaryArray=new double[30];
 * 2, 根据数组的序号来储存数据
 *          salaryArray[0]=9000.0;
 * 3, 根据序号来获取数组：
 *          double salary1=salaryArray[0];
 * 开发一个软件（工资计算器）：
 * 公司统计员工资
 * 主要统计应发工资的总额，最高工资，平均工资
 * 需求分析：
 * 1，数据源：员工工资，多少员工？30个与昂 double salary=9000.0;
 *                              定义30个变量，工作量太大，无法体现计算机提高生产力
 * 2，数据源处理
 * 3，结果显示
 *
 *
 * 问题1：之前的学习基本类型，主要是单个数据byte short int long float double char String
 *             复杂数据类型1： 数组，相当于一个大箱子，直接把30个数据装到箱子里
 *
 */


public class Array01 {
    public static void main(String[] args){

        double[] salaryArray=new double[30];
        salaryArray[0]=9.0;
        salaryArray[1]=10.0;
        salaryArray[2]=8.0;
        salaryArray[3]=10.0;
        salaryArray[4]=12.5;

        double sum= getSum(salaryArray);
        System.out.println( getSum(salaryArray));

        double max = getMaxSalary(salaryArray);
        System.out.println(max);

        double average = getAverageSalary(salaryArray);
        System.out.println(average);
    }

    /**
     * 初始化公司数据
     *
     */
    public  static void initiaSalaryData(){
        //30个员工公司数据
        //创建了一个double类型的数据，能装30个double数据
        //解决问题，最重要是数据结构
        //先了解有哪些数据结构，选择合适的数据结构
        double[] salaryArray=new double[30];
        salaryArray[0]=9000.0;
        salaryArray[1]=10000.0;
        salaryArray[2]=8000.0;
        salaryArray[3]=10000.0;
        salaryArray[4]=12000.5;
        //其他没有直接附值的值为0.0
        double salary1=salaryArray[0];

        System.out.println(salary1);

        double sum= getSum(salaryArray);
        System.out.println( getSum(salaryArray));

        double max = getMaxSalary(salaryArray);
        System.out.println(max);
    }

    public static double getSum(double [] salaryArray){

        double sum=0;
        for (int i =0;i<salaryArray.length;i++){

            sum = sum+salaryArray[i];
            System.out.println("当前元素序号"+i+"元素值"+salaryArray[i]+"和为"+sum);

        }



        return sum;

    }

    public static double getMaxSalary(double[] salary){
        //求最大值
        //9000 10000 8000
        double max =0;
        double temp=0;

        for (int i= 0;i<salary.length;i++){

            if (salary[i]>max){

               temp= salary[i];
               salary[i] = max;
               max = temp;



            }


        }

        return max;
    }

    public static double getAverageSalary(double[] salaryArray){

        double sum=0;
        int term=0;
        for (int i =0;i<salaryArray.length;i++){

            sum = sum+salaryArray[i];
            term++;


        }

        double average =sum/term;

        return average;
    }

}


