import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JTableExample1 extends JApplet implements ActionListener {
	JButton b1;
	JTable jt;
  	public void init() {
		setLayout(new FlowLayout());
	
		b1=new JButton("ClickME");add(b1);
		jt=new JTable(10, 10);
		add(jt);
		jt.setValueAt("Enter A value", 0, 0);
		jt.setValueAt("Enter B value", 0, 1);
		b1.addActionListener(this);
		}	
	public void actionPerformed(ActionEvent ae) {
		
		int a=0,b=0,c=0;
		for(int i=0;i<10;i++)
		{		 
	 
		a=Integer.parseInt((String)jt.getValueAt(i, 0));
		b=Integer.parseInt((String)jt.getValueAt(i, 1));
 	    c=a+b;
 	    jt.setValueAt("Result Is"+c, i, 2); 
		}
 	    
 			}
 }
