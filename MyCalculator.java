import java.awt.*;
import java.awt.event.*;
public class MyCalculator extends Frame
{	Frame f;
	Button b;
	TextField tf;
	MyCalculator(String s)
	{	f=new Frame(s);
		for(int i=0;i<10;i++)
		{	b=new Button(String.valueOf(i));
			b.setBounds(20,100,40,40);
			f.add(b);
			tf=new TextField();
			f.add(tf);
			f.setLayout(null);
		}
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String[] s)
	{	new MyCalculator("My Calculator");
	}
}
