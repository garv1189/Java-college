import java.util.*;
class area
{
	private float l,b;
	
	public area()
	{
		System.out.println("Default");
		Scanner sc=new Scanner(System.in);
		System.out.println("Side length: ");
		 l=sc.nextFloat();
		System.out.println("Area: "+(l*l));
	}
	
	public area(float l1, float b1)
	{
		System.out.println("Parameterised");
		l=l1;
		b=b1;
		System.out.println("Area: "+(l*b));
	}
	
	public area(area a)
	{	
		System.out.println("Copy");
		l=a.l;
		b=a.b;
		System.out.println("Area: "+(l*b));
	}
}

class e6p2
{
	public static void main(String args[])
	{
		area a=new area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		System.out.println("Enter length and breadth:");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		area a2=new area(l,b);
		area a3=new area(a2);
	}
}
