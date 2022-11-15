//save this file as Main.java
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}
public class Main{
    static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age is not valid to vote");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String arg[]){
        try{
            validate(Integer.parseInt(arg[0]));
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
        catch(InvalidAgeException ae){
            System.out.println(ae);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}