//save this file as Circle.java
public class Circle{
    double r;
    Circle(Circle c){
        r=c.r;
    }
    Circle(){}
    void display(){
        System.out.println("Radius of circle: "+r);
    }
    public static void main(String arg[]){
        Circle c = new Circle();
        c.r=5.0;
        Circle c2= new Circle(c);
        System.out.println("Circle c");
        c.display();
        System.out.println("Circle c2");
        c2.display();
    }
}