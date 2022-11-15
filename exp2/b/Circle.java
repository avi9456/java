//save this file as Circle.java
public class Circle{
    double r;
    Circle(double r){
        this.r=r;
    }
    void display(){
        System.out.println("Radius of circle: "+r);
    }
    public static void main(String arg[]){
        Circle c = new Circle(5.0);
        c.display();
    }
}