import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator implements ActionListener
{
	JFrame f;
	JTextField tf;
	JButton[] num=new JButton[10];
	JButton[] func=new JButton[6];
	JButton add,sub,mult,divd,clear,eq;
	JPanel p;

	int num1=0;
	int num2=0;
	char operator;
	int result=0;
	
	
	Calculator()
	{
		f=new JFrame("Calculator");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(420,520);
		f.setLayout(null);
		
	
		tf=new JTextField();
		tf.setBounds(50,25,300,50);
		tf.setEditable(false);
	
		add=new JButton("+");
		sub=new JButton("-");
		mult=new JButton("*");
		divd=new JButton("/");
		clear=new JButton("C");
		eq=new JButton("=");
	
		func[0]=add;
		func[1]=sub;
		func[2]=mult;
		func[3]=divd;
		func[4]=clear;
		func[5]=eq;
	
		for(int i=0;i<6;i++)
		{
			func[i].addActionListener(this);
		}
		
	
		for(int i=0;i<10;i++)
		{
			num[i]=new JButton(String.valueOf(i));
			num[i].addActionListener(this);		
	
		}
	
		clear.setBounds(40,420,160,40);
		eq.setBounds(220,420,160,40);
		
		p=new JPanel();
		p.setBounds(50,80,300,220);
		p.setLayout(new GridLayout(4,4,10,10));
		p.setBackground(Color.GRAY);
	
		p.add(num[1]);
		p.add(num[2]);
		p.add(num[3]);
		p.add(func[0]);
	
		p.add(num[4]);
		p.add(num[5]);
		p.add(num[6]);
		p.add(func[1]);
	
		p.add(num[7]);
		p.add(num[8]);
		p.add(num[9]);
		p.add(func[2]);
		
		p.add(num[0]);
		p.add(func[3]);
	
		
		f.add(p);
		f.add(clear);
		f.add(eq);
		f.add(tf);
		f.setVisible(true);
	}
	
	public static void main(String [] args)
	{
		Calculator c=new Calculator();	

	}

	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==num[i])
			{
							tf.setText(tf.getText().concat(String.valueOf(i)));					
	
			}
	
		}
		
	
	}
}