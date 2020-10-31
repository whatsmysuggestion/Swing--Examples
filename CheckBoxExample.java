import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBoxExample extends JApplet implements ItemListener 
{
		JCheckBox jc1,jc2;
		CheckboxGroup cbg;
		
	 	public void init() {
	 		
	 		setLayout(new FlowLayout());
	 		jc1=new JCheckBox("First"); 
	 		jc2=new JCheckBox("Second"); 
	 		cbg=new CheckboxGroup();
	 	/*	
	 	add(jc1);
	 		add(jc2);*/
	 		add(jc1, cbg);
	 		add(jc2, cbg);
	 		 
	 		jc1.addItemListener(this);
	 		jc2.addItemListener(this);
	 	
	 	}
	
	
	public void itemStateChanged(ItemEvent arg0) {
		
		if(arg0.getSource()==jc1)
			JOptionPane.showMessageDialog(null, "First");
		else
		  JOptionPane.showMessageDialog(null, "Second");
		 
	}

}
