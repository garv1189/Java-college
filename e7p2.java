import java.util.*;
class Staff
{
	protected  int code;
	protected String name;
	
}

class Teacher extends Staff
{
	private String sub;
	private int exp;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Teacher");
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter code");
		code=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Subject");
		sub=sc.nextLine();
		System.out.println("Enter Experience (in years)");
		exp=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name"+name+"\nCode:"+code+"\nSubject"+sub+"\nExperience"+exp);
	}
}

class Officer extends Staff
{
	private String dept;
	private int gr;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Officer");
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter code");
		code=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter department");
		dept=sc.nextLine();
		System.out.println("Enter grade");
		gr=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name"+name+"\nCode:"+code+"\nDepartment"+dept+"\nGrade"+gr);

	}
}

class Typist extends Staff
{
	protected int speed,exp;
	
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter code");
		code=sc.nextInt();
		System.out.println("Enter speed");
		speed=sc.nextInt();
		System.out.println("Enter Experience (in years)");
		exp=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name"+name+"\nCode:"+code+"\nSpeed"+speed+"\nExperience"+exp);
	}
}

class Regular extends Typist
{
	private int sal;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Regular Typist");
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter code");
		code=sc.nextInt();
		System.out.println("Enter speed");
		speed=sc.nextInt();
		System.out.println("Enter salary");
		sal=sc.nextInt();
		System.out.println("Enter Experience (in years)");
		exp=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name"+name+"\nCode:"+code+"\nSpeed"+speed+"\nSalary"+sal+"\nExperience"+exp);
	}
}


class Casual extends Typist
{
	private  int dw;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Casual");
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter code");
		code=sc.nextInt();
		System.out.println("Enter speed");
		speed=sc.nextInt();
		System.out.println("Enter daily wage");
		dw=sc.nextInt();
		System.out.println("Enter Experience (in years)");
		exp=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name"+name+"\nCode:"+code+"\nSpeed"+speed+"\nDaily Wage"+dw+"\nExperience"+exp);
	}
}

class e7p2
{
	public static void main(String args[])
	{
		System.out.println("Garv Trivedi - 60009220047");
Teacher t=new Teacher();
		Regular r=new Regular();
		Casual c=new Casual();
		Officer o=new Officer();
		t.read();
		r.read();
		c.read();
		o.read();
		
		t.display();
		r.display();
		c.display();
		o.display();
	}
}

