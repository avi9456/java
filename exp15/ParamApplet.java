import java.applet.*;
import java.awt.*;
/*<applet code="ParamApplet" height='500' width='500'>
<param name='sub1' value='java'>
<param name='sub2' value-='ADS'></applet>*/
public class ParamApplet extends Applet{  
    public void paint(Graphics g)
    {  
        String sub1=getParameter("sub1");   
        g.drawString(sub1,50, 50);  
    }  

}  