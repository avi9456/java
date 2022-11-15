import java.io.*;
class InputOutputStream{
    public static void main(String arg[]){
        try{
            OutputStream fout = new FileOutputStream("text.txt");
            String s="Sathyabama";
            byte[] b=s.getBytes();
            fout.write(b);
            System.out.println("File Written Successfully");
            fout.flush();
            fout.close();
            InputStream fin = new FileInputStream("text.txt");
            fin.read(b);
            String st=new String(b);
            System.out.println("File contain");
            System.out.println(st);
            fin.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}