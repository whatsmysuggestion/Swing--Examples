import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JTableExample extends JApplet implements ActionListener {
	JButton b1;
	ImageIcon ii;
  	public void init() {
		setLayout(new FlowLayout());
		ii=new ImageIcon("kkar.png");
		b1=new JButton("ClickME",ii);
		add(b1);
		b1.addActionListener(this);
		}	
	public void actionPerformed(ActionEvent ae) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Enter a value"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Enter b value"));
		if(JOptionPane.showConfirmDialog(null, "Do You Want Addition?")==0)
		{
			int c=a+b;
			JOptionPane.showMessageDialog(null, "Result Is"+c);
		}
			}
 

}
