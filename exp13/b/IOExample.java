import java.io.*;
class IOExample{
    public static void main(String[] arg){
        try{
            Writer w=new FileWriter("text.txt");
            String s="Sathyabama";
            w.write(s);
            w.close();
            System.out.println("Written Successfully");
            Reader r = new FileReader("text.txt");
            char c[] = new char[100];
            r.read(c);
            System.out.println("Input File Content");
            System.out.println(c);
            r.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}