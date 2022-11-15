import java.awt.*;  
import java.awt.event.*;  
public class mousevent extends Frame implements MouseListener,MouseMotionListener{  
    Label l,l2;  
        mousevent(){  
        addMouseListener(this);
        addMouseMotionListener(this);  
        l=new Label();
        l2=new Label(); 
        l.setBounds(20,50,100,20);
        l2.setBounds(50,100,100,20);  
        add(l); 
        add(l2);
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) { 
        l2.setText("Mouse Released");
    }
    public void mouseMoved(MouseEvent e){
        int x=e.getX();
        int y=e.getY();
        l2.setText("Mouse Moved"+" "+x+" "+y);
    }
    public void mouseDragged(MouseEvent e){
        int x=e.getX();
        int y=e.getY();
        l2.setText("Mouse Dragged"+" "+x+" "+y);
    }
public static void main(String[] args) {  
    new mousevent();  
}  
}  