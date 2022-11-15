import java.applet.*;
import java.awt.*;

public class LifeCycleApplet extends Applet{
    StringBuffer strBuffer;
    public void init(){
        setBackground(Color.green);
        setFont(new Font("Arial",Font.PLAIN, 20));
        strBuffer =new StringBuffer();
        addItem("Initializing the applet ");
    }
    public void start(){
        addItem("Starting the applet ");
    }
    public void stop(){
        addItem("Stoping the applet ");
    }
    public void destroy(){
        addItem("Destroying the applet ");
    }
    void addItem(String word){
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }
    public void paint(Graphics g){
        g.drawRect(0,0,getWidth()-1,getHeight()-1);
        g.drawString(strBuffer.toString(),10,20);
    }
}
/*<applet code="LifeCycleApplet.class" height='300' width='300'></applet> */