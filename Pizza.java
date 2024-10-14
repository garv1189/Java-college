    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pizza extends JFrame implements ActionListener
{
	Container c;
	JLabel lblname,lblsize,lblcheese,lbltopping,lbldetails;
	JRadioButton rbSmall,rbMed,rbLarge;
	JCheckBox cbMozz,cbChedd;
	JTextField name;
	JButton button,exit;
	JTextArea details;
	Choice Toppings;


	Pizza()
	{
	c=getContentPane();
	setLayout(new FlowLayout());
	
	lblname=new JLabel("Name: ");
	lblsize=new JLabel("\nSize: ");
	lblcheese=new JLabel("\nCheese: ");
	lbltopping=new JLabel("\nToppings: ");
	lbldetails=new JLabel("\nDetails: ");

	rbSmall=new JRadioButton("Small");
	rbMed=new JRadioButton("Medium");
	rbLarge=new JRadioButton("Large");

	cbMozz=new JCheckBox("Mozzarella");
	cbChedd=new JCheckBox("Cheddar");
	
	button=new JButton("Submit");
	button.addActionListener(this);
	exit=new JButton("Exit");
	exit.addActionListener(this);

	name=new JTextField(20);
	details=new JTextArea(7,20);	


	Toppings=new Choice();
	Toppings.add("Pepperoni");
	Toppings.add("Mushrooms");
	Toppings.add("Avacados");
	Toppings.add("Eggplants");
	Toppings.add("Peppers");
	Toppings.add("OLives");
	Toppings.add("Buffalo Mozzarella");
	Toppings.add("Jalapenoes");
	Toppings.add("Pickles");
	Toppings.add("Basil");
	Toppings.add("Cherry Tamotoes");
	Toppings.add("Sausage");

	
	c.add(lblname);
	c.add(name);
	c.add(lblsize);
	c.add(rbSmall);
	c.add(rbMed);
	c.add(rbLarge);
	c.add(lblcheese);
	c.add(cbMozz);
	c.add(cbChedd);
	c.add(lbltopping);
	c.add(Toppings);
	c.add(button);
	c.add(exit);
	c.add(details);


	}
	


	public void actionPerformed(ActionEvent e)
	{
	 if(e.getSource()==button)
	 details.setText("Pizza: "+name.getText()+"\nSize: "+Size()+"\nCheese: "+Cheese()+"\nTopping: "+Toppings.getSelectedItem());
	else if(e.getSource()==exit)
	 System.exit(0);
	}

	
	public String Size()
	{
	if(rbSmall.isSelected())
	return "Small";
	 else if(rbMed.isSelected())
	return "Medium";
	else
	return "Large";
	}

	public String Cheese()
	{
	if(cbMozz.isSelected()&&cbChedd.isSelected())
	return "Mozzarella and Cheddar";
	else if(cbMozz.isSelected())
	return "Mozzarella";
	else
	return "Cheddar";
	}

	public static void main(String args[])
	{
	 Pizza p=new Pizza();
	 p.setSize(350,400);
	 p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
	 p.setVisible(true);
	}
}

