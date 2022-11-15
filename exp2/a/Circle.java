//save this file as Circle.java
public class Circle{
    double r;
    Circle(){}
    void display(){
        System.out.println("Radius of circle: "+r);
    }
    public static void main(String arg[]){
        Circle c = new Circle();
        c.display();
    }
}