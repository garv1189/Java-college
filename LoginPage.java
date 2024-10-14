import java.awt.*;

class LoginPage extends Frame
{
	LoginPage()
	{	
		
		Label l1=new Label("Username");
		Label l2=new Label("Password");
		
		Button b=new Button("Login");
	
		TextField t1=new TextField();
		TextField t2=new TextField();
		
	
		l1.setBounds(20,80,80,30);
		l2.setBounds(20,120,80,30);
		
		t1.setBounds(100,80,80,30);
		t2.setBounds(100,120,80,30);
	
		b.setBounds(100,220,80,30);

		add(l1);
		add(l2);
		add(b);
		add(t1);
		add(t2);
		
		setVisible(true);
		setSize(400,400);
		setLayout(null);
		setTitle("Login Page");
	}	
	
	public static void main(String [] args)
	{
		new LoginPage();
		
	} 
	
}