//save this file as Circle.java
public class Circle{
    double r;
    double area(){
        return (Math.PI*r*r);
    }
    double circumference(){
        return(2*Math.PI*r);
    }
    void display(){
        System.out.println("Radius of circle: "+r);
        System.out.printf("Area of circle: %.2f\n",area());
        System.out.printf("Circumference of circle: %.2f\n",circumference());
    }
    public static void main(String arg[]){
        Circle c = new Circle();
        System.out.print("Enter radius of circle: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        c.r=in.nextDouble();
        c.display();
    }
}