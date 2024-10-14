import java.util.*;
class Student 
{
	protected int rno;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number: ");
		rno=sc.nextInt();
	}
}	

class Test extends Student
{
	protected int sem1m,sem2m;
	public void read()
	{
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sem1 marks and Sem2 marks:");
		sem1m=sc.nextInt();
		sem2m=sc.nextInt();
	}
}

interface Sports
{
	int in=100,na=75,st=50;
	void score();
}
class Result extends Test implements Sports
{
	private int total;
	public void score()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the level of tournament participated in:");
		System.out.println("1 for International");
		System.out.println("2 for National");
		System.out.println("3 for State");
		int c=sc.nextInt();
		switch(c)
		{
			case 1:
				total=sem1m+sem2m+in;
				break;
			case 2:
				total=sem1m+sem2m+na;
				break;
			case 3:
				total=sem1m+sem2m+st;
				break;
			default:
				total=sem1m+sem2m;
				System.out.println("Participation in no sports");
				break;
		}
		System.out.println("Result: "+total);
	}
}
class e8p1
{
	public static void main(String args[])
	{
		System.out.println("Garv Trivedi - 60009220047");
Result r=new Result();
		r. read();
		r.score();
	}
}
