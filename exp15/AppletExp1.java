// This is a Simple Java Applet
// program using appletviewer
 
import java.applet.*;
import java.awt.*;
 
/*
<applet  code="AppletExp1" width=600 height=300>
</applet>
*/
 
public class AppletExp1 extends Applet {
    public void init()
    {
        System.out.println("Initializing an applet");
    }
 
    public void start()
    {
        System.out.println("Starting an applet");
    }
    public void stop()
 
    {
        System.out.println("Stopping an applet");
    }
    public void destroy()
 
    {
        System.out.println("Destroying an applet");
    }
}