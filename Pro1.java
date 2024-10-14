import java.util.*;
import java.awt.*;

class Calculator
{
	public Calculator()
	{
		Frame f=new Frame();

		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		Button b6=new Button("6");
		Button b7=new Button("7");
		Button b8=new Button("8");
		Button b9=new Button("9");
		Button b10=new Button(".");
		Button b11=new Button("0");
		Button b12=new Button("C");
		Button b13=new Button("+");
		Button b14=new Button("-");
		Button b15=new Button("*");
		Button b16=new Button("/");
		Button b17=new Button("%");
		Button b18=new Button("(");
		Button b19=new Button(")");
		Button b20=new Button("=");
	

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		f.add(b17);
		f.add(b18);
		f.add(b19);
		f.add(b20);

		f.setVisible(true);
		f.setSize(500,600);
		f.setLayout(gridLayout(4,5));
	}
}

class Pro1
{
	public static void main(String [] args)
	{
		Calculator c=new Calculator();
	}

}