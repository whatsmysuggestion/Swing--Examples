import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AdapterExample extends JApplet {
	
	int x,y;
	
 	public void init() {
 
 		addMouseMotionListener(new MouseAdapter() {
 			
 		 
 			public void mouseMoved(MouseEvent e) {
 					
 				x=e.getX();
 				y=e.getY();
 				Graphics g=getGraphics();
 				g.drawString(x+"  "+y, x, y);
 			}
 	 			
		});
 	
 	}

}
