import javax.swing.*;
import java.awt.*;
public class SimpleSwingExample extends JApplet
{
	JButton b1;
	Button b2;
	ImageIcon ii;
	public void init() {
		setLayout(new FlowLayout());
		ii=new ImageIcon("kkar.png");
		b1=new JButton("Click",ii);
		b2=new Button("Click");
		add(b1);
		add(b2);
 
	}
}
