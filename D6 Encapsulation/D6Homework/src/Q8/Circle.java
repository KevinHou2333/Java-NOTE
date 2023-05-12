package Q8;

public class Circle {
    public static void main(String[] args) {

        Variable[] variables = initData();
        System.out.println(showArea(variables));
        System.out.println(showPerimeter(variables));

    }

    public static double showArea(Variable[] variables){
        double area = 0.0;

       Variable variable = variables[0];

       area= variable.getRadius()* variable.getRadius()*variable.getPai();


        return area;
    }

    public static double showPerimeter(Variable[] variables){
        double perimeter =0.0;

        Variable variable= variables[0];

        perimeter= variable.getRadius()*variable.getPai()*2;

        return perimeter;
    }


    public static Variable[] initData(){
        Variable[] variables= new Variable[1];
        Variable variable1= new Variable(8,3.14);
        Variable[] variables1= new Variable[]{variable1};

        return variables1;
    }


}
