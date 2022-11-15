//save this file as Main.java
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eating bread...");
    }
    void bark(){
        System.out.println("barking...");
    }
    void work(){
        super.eat();
    }
}
public class Main{
    public static void main(String[] arg){
        Dog d = new Dog();
        System.out.println("Dog is created");
        d.eat();
        d.bark();
        d.work();
    }
}