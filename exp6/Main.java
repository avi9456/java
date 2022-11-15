//save this file as Main.java
interface PI {
    public static final double pi=3.141;
}
interface Shape{
    public abstract double area(double x,double y);
    void display();
}
class Square implements Shape{
    double x;
    Square(double x,double y){
        try{
            if(x==y){
            this.x=x;
            }
            else{
                throw new Exception("edge of square should be equal");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    Square(double x){
        this(x,x);
    }
    Square(){
        this(1);
    }
    public double area(double x, double y){
        return(x*y);
    }
    public double area(double x){
        return this.area(x,x);
    }
    public double area(){
        return this.area(x);
    }
    public void display(){
        System.out.println("Area of square: "+area());
    }
}
class Rectangle implements Shape{
    double x, y;
    Rectangle(double x, double y){
        this.x=x;
        this.y=y;
    }
    Rectangle(double x){
        this(x,x);
    }
    Rectangle(){
        this(1);
    }
    public double area(double x, double y){
        return(x*y);
    }
    public double area(double x){
        return this.area(x,x);
    }
    public double area(){
        return this.area(x,y);
    }
    public void display(){
        System.out.println("Area of rectangle: "+area());
    }
}
class Triangle implements Shape{
    double x,y;
    Triangle(double x, double y){
        this.x=x;
        this.y=y;
    }
    Triangle(double x){
        this(x,1);
    }
    Triangle(){
        this(1);
    }
    public double area(double x, double y){
        return((x*y)/2);
    }
    public double area(double x){
        return this.area(x,1);
    }
    public double area(){
        return this.area(x,y);
    }
    public void display(){
        System.out.println("Area of triangle: "+area());
    }
}
class Circle implements Shape,PI{
    double r;
    Circle(double r){
        this.r=r;
    }
    Circle(){
        this(1);
    }
    public double area(double r,double r2){
        return(pi*r*r2);
    }
    public double area(double r){
        return this.area(r,r);
    }
    public double area(){
        return this.area(r);
    }
    public void display(){
        System.out.println("Area of circle: "+area());
    }
}
public class Main{
    public static void main(String arg[]){
        Shape s = new Square(5);
        System.out.println("Square is created");
        s.display();
        s = new Circle(5);
        System.out.println("Circle is created");
        s.display();
        s = new Rectangle(10,5);
        System.out.println("Rectangle is created");
        s.display();
        s = new Triangle(5,6);
        System.out.println("Trinagle is created");
        s.display();

    }
}