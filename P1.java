import java.awt.*;

class P1 extends Frame
{
	P1()
	{
		Button b=new Button("Click Me");
		b.setBounds(100,100,80,30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}//constructor method

	public static void main(String [] args)
	{
		P1 p=new P1();
	}

}