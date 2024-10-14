import java.awt.*;

class P3
{
	public static void main(String [] args)
	{
		Frame f=new Frame("Labels and buttons");
		Label l1,l2;
		l1=new Label("Label 1");
		l2=new Label("Label 2");
		l1.setBounds(50,100,100,30);
		l2.setBounds(50,150,100,30);

		f.add(l1);
		f.add(l2);

		Button b1,b2;
		b1=new Button("Button 1");
		b2=new Button("Button 2");
		b1.setBounds(150,100,100,30);
		b2.setBounds(150,150,100,30);

		f.add(b1);
		f.add(b2);

		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
}