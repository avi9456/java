//save this file as Main.java
public class Main{
    public static void main(String arg[]){
        try{
            double a = Double.parseDouble(arg[0]);
            double b = Double.parseDouble(arg[1]);
            System.out.println(a/b);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException be){
            System.out.println(be);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}