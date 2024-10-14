import java.util.*;
class Parent
{
	protected int x=10;
	public void display()
	{
		System.out.println("The variable in base class is x= "+x);
	}
}

class Child extends Parent
{
	public void display()
	{
		x=20;
		System.out.println("The variable in child class is x= "+x);
	}
}

class e8p3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
Parent ref;
		Parent p=new Parent();
		Child c=new Child();
		System.out.println("Type 1 for Parent class and 2 for Child class");
		int ch=sc.nextInt();
		if(ch==1)
		{
			ref=p;
			ref.display();
		}
		else if(ch==2)
		{
			ref=c;
			ref.display();
		}
		else
		System.out.println("Invalid input");
	}
}
