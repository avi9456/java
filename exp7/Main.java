//save this file as Main.java
import calculator.*;
public class Main{
    public static void main(String arg[]){
        Sum s = new Sum();
        Difference d = new Difference();
        Multiply p = new Multiply();
        Divide q = new Divide();
        double result=0;
        try{
            result=Double.parseDouble(arg[0]);
            for(int i=1;i<arg.length;i+=2){
                switch(arg[i]){
                    case "+":result=s.sum(result,Double.parseDouble(arg[i+1]));
                                break;
                    case "-":result=d.diff(result,Double.parseDouble(arg[i+1]));
                                break;
                    case "*":result=p.prod(result,Double.parseDouble(arg[i+1]));
                                break;
                    case "/":result=q.div(result,Double.parseDouble(arg[i+1]));
                                break;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println(result);
        }
    }
}