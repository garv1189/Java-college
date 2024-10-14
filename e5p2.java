import java.util.*;
class e5p2
{
	static float area(float l)
	{
		return (l*l);
	}
	
	static float area( float l, float b)
	{
		return (l*b);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		System.out.println("Enter 1 for Area of Square and 2 for area of rectangle");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter side length: ");
		 	float l=sc.nextFloat();
			float a=area(l);
			System.out.println("Area: "+a);
		}
		else if (n==2)
		{
			System.out.println("Enter length and breadth: ");
			float l= sc.nextFloat();
			float b= sc.nextFloat();
			float a=area(l,b);
			System.out.println("Area: "+a);
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}
