//save this the file as Main.java
public class Main extends Thread{
    public static int x;
    public void run(){
        for(int i=0;i<100;i++){
            x=x+1;
            x=x-1;
        }
    }
    public static void main(String arg[]){
        x=0;
        for(int i=0;i<1000;i++){
            Thread t= new Main();
            t.run();
            System.out.print(x);
        }
    }
}