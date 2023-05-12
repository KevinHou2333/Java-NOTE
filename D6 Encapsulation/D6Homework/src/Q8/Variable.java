package Q8;

public class Variable {
    private double radius;

    private double pai;
   public Variable(double radius,double pai){
       setRadius(radius);
       setPai(pai);
   }
    public void setRadius(double radius) {
        this.radius = radius;
    }


   public double getRadius(){
       return radius;
    }
    public void setPai(double pai){
       this.pai=pai;
    }

    public double getPai(){
       return pai;
    }

}





