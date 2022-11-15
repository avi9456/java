import java.awt.*;    
import java.awt.event.*;    
public class keyboardevent extends Frame implements KeyListener {    
    Label l,l2;    
    TextArea area;    
    keyboardevent() {      
        l = new Label();     
        l.setBounds (20, 50, 100, 20); 
        l2 = new Label();     
        l2.setBounds (250, 250, 270, 270);     
        area = new TextArea();       
        area.setBounds (20, 80, 200, 200);      
        area.addKeyListener(this);  
        add(l);
        add(l2); 
        add(area);    
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    
    public void keyPressed (KeyEvent e) {    
        l2.setText ("Key Pressed");    
    }     
    public void keyReleased (KeyEvent e) {    
        l.setText ("Key Released");    
    }    
    public void keyTyped (KeyEvent e) {    
        l.setText ("Key Typed");    
    }    
    public static void main(String[] args) {    
        new keyboardevent();    
    }    
}  