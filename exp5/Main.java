//Save this file as Main.java
abstract class Bike{
    Bike(){
        System.out.print("bike is created");
    }
    void changeGear(){
        System.out.println("gear changed");
    }
    abstract void run();
}
class Ninja extends Bike{
    Ninja(){
        super();
        System.out.println(" Ninja");
    }
    void run(){
        System.out.println("running safely");
    }
}
public class Main{
    public static void main(String arg[]){
        Bike b= new Ninja();
        b.run();
        b.changeGear();
    }
}