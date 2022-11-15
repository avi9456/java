//save this file as Main.java
class Dimenssion{
    double radius;
    Dimenssion(double radius){
        this.radius = radius;
    }
    Dimenssion(){
        this(0);
    }
}
class Circle extends Dimenssion{
    Circle(double radius){
        super(radius);
    }
    Circle(){
        super();
    }
    void area(){
        System.out.printf("Area of circle: %.2f",(Math.PI*radius*radius));
    }
}
public class Main{
    public static void main(String arg[]){
        Circle c = new Circle(5);
        c.area();
    }
}