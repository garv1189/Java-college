import java.util.*;

class AreaCalc
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of side of square");
		int s=sc.nextInt();
		
		System.out.println("Enter length of the rectangle");
		int l=sc.nextInt();

		System.out.println("Enter breadth of the rectangle");
		int b=sc.nextInt();
		
		int areaSq=AreaCalc(s);
		int areaRect=AreaCalc(l,b);
		
		System.out.println("Area of Square is"+areaSq);
		System.out.println("Area of rectangle is"+areaRect);
		 
	}//main

	public static int AreaCalc(int s)
	{
		return s*s;
	}//square

	public static int AreaCalc(int l,int b)
	{
		return l*b;
	}//rectangle

}//class