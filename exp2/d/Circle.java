//save this file as Circle.java
public class Circle{
    double r;
    Circle(double r){
        this.r=r;
    }
    Circle(Circle c){
        this(c.r);
    }
    Circle(){
        this(0);
    }
    void display(){
        System.out.println("Radius of circle: "+r);
    }
    public static void main(String arg[]){
        Circle c[] = new Circle[3];
        c[0]=new Circle();
        c[1]=new Circle(5.0);
        c[2]=new Circle(c[1]);
        for(int i=0;i<3;i++){
            System.out.println("Circle "+i);
            c[i].display();
        }
    }
}