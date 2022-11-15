import java.io.*;
class DataInputOutput{
    public static void main(String arg[]){
        try{
            DataOutputStream dos=new DataOutputStream(new FileOutputStream("text.txt"));
            int a=65;
            String s=" Sathyabama";
            byte[] b1=s.getBytes();
            dos.flush();
            dos.write(a);
            dos.flush();
            dos.write(b1);
            System.out.println("Written Successfully");
            DataInputStream dis = new DataInputStream(new FileInputStream("text.txt"));
            char i=(char)dis.read();
            byte[] b = new byte[100];
            dis.read(b);
            String st=new String(b);
            System.out.println("File Contain");
            System.out.println(i+" "+st);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}