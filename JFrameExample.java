 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
 
public class JFrameExample extends JFrame  implements ActionListener{

	MenuBar jmb;
	Menu jm;
	MenuItem jmi;
 	
	JFrameExample()
	{
	 
	 jmb=new MenuBar();
	 setMenuBar(jmb);
	 
	 jm=new Menu("File");
	 jmb.add(jm);
	 
	 jmi=new MenuItem("Exit");
	 jm.add(jmi);
	 jmi.addActionListener(this);
		
	}
	public static void main(String[] args) {
				 
		JFrameExample je=new JFrameExample();
		
		je.setTitle("FirstFrame");
		je.setVisible(true);
		je.setSize(400, 400);
		je.setLayout(null);
		je.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	}
	 
	public void actionPerformed(ActionEvent e) 
	{  
		System.exit(0);
	}

}
