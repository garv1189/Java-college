//Using association

import java.awt.*;

class P2
{
	P2()
	{
		Frame f=new Frame();
		Button b=new Button("Click Me");
		b.setBounds(30,100,80,30);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);	
	}
	
	public static void main(String [] args)
	{
		P2 p=new P2();
	}
}