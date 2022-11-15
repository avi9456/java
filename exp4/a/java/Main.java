//save this file as Main.java
class Animal{
    String color = "white";
}
class Dog extends Animal{
    String color = "black";
    void color(){
        System.out.println(super.color);
        System.out.println(color);
    }
}
public class Main{
    public static void main(String arg[]){
        Dog d = new Dog();
        System.out.println("Dog is created");
        System.out.println("Color of dog is");
        d.color();
    }
}