import java.util.*;

class Staff				//Var:code,name
{
	protected int code;
	protected String name;

}

class Teacher extends Staff		//Var:sub,exp;Mtd:read,display
{
	Staff s1=new Staff();
	private int exp;
	private String sub;
	
	public void read()
	{
		Scanner sc=new Scanner();
		System.out.println("Enter the staff code");
		code=sc.nextInt();
		System.out.println("Enter the staff name");
		name=sc.nextLine();
		System.out.println("Enter the teacher experience");
		exp=sc.nextInt();
		System.out.println("Enter the teacher subject");
		sub=sc.nextLine();
	}

	public void display()
	{
	System.out.println("The teacher staff code"+code);
	System.out.println("The teacher staff name"+name);
	System.out.println("The teacher staff experience"+exp);
	System.out.println("The teacher staff subject"+sub);
	
	}

}

class Typist extends Staff		//var:speed,exp
{
	Staff s2=new Staff();
	protected int speed;
	protected int exp;	
}

class Officer extends Staff		//var:dept,grade;Mtd:read,display
{
	Staff s3=new Staff();
	private String dept;
	private String grade;
	
	public void read()
	{
		Scanner sc=new Scanner();
		System.out.println("Enter the staff code");
		code=sc.nextInt();
		System.out.println("Enter the staff name");
		name=sc.nextLine();
		System.out.println("Enter the Officer department");
		dept=sc.nextLine();
		System.out.println("Enter the Officer Grade");
		grade=sc.nextLine();
	}
	
	public void display()
	{
		System.out.println("The Officer staff code"+code);
		System.out.println("The Officer staff name"+name);
		System.out.println("The Officer staff department"+dept);
		System.out.println("The Officer staff grade"+grade);
	}	
	
}

class Regular extends Typist		//Var:salary;Mtd:read,disp
{
	Typist t1=new Typist();
	private	int salary;
	public void read()
	{
		Scanner sc=new Scanner();
		System.out.println("Enter the Regular typist staff code");
		code=sc.nextInt();
		System.out.println("Enter the Regular typist staff name");
		name=sc.nextLine();
		System.out.println("Enter the Regular typist salary");
		salary=sc.nextInt();
	}
	
	public void disp()
	{
		System.out.println("The Reg.Typist staff code"+code);
		System.out.println("The Reg.Typist staff name"+name);
		System.out.println("The Reg.Typist staff salary"+salary);
	}
	
}

class Casual extends Typist		//Var:dailywage;Mtd:read disp
{
	Typist t2=new Typist();
	private int wage;
	public void read()
	{
		Scanner sc=new Scanner();
		System.out.println("Enter the  typist staff code");
		code=sc.nextInt();
		System.out.println("Enter the typiststaff name");
		name=sc.nextLine();
		System.out.println("Enter the typist daily wage");
		wage=sc.nextInt();
	}

	public void disp()
	{
		System.out.println("The Cas.Typist staff code"+code);
		System.out.println("The Cas.Typist staff name"+name);
		System.out.println("The Cas.Typist staff wage"+wage);
	}

}
	
class Inh1
{

	public static void main(String [] args)
	{
		Teacher t1=new Teacher();
		t1.read();
		t1.display();
		Officer o1=new Officer();
		o1.read();
		o1.display();
		Regular r1=new Regular();
		r1.read();
		r1.display();
		Casual c1=new Casual();
		c1.read();
		c1.display();
	}
	
}