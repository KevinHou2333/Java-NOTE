package Q9;

import java.util.concurrent.Callable;

public class Demo1 {

    public static void main(String[] args) {
        Manager M = new Manager("James",9527,15000,0.0);
        M.intro();
        M.showSalary();
        M.work();
        System.out.println("======================================");
       Coder C= new Coder("Kobe",25,10000);
       C.intro();
       C.showSalary();
       C.work();


    }



}
