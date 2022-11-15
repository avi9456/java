//Save this file as Main.java
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}
public class Main{
    public static void main(String arg[]){
        Dog d = new Dog();
        System.out.println("Dog is created");
        d.bark();
        d.eat();
        Cat c = new Cat();
        System.out.println("Cat is created");
        c.meow();
        c.eat();

    }
}