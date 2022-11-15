//save this file as Main.java
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
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping...");
    }
}
public class Main{
    public static void main(String arg[]){
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}