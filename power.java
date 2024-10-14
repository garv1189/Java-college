import java.util.*;

class power
{
	public static void main(String [] args)
	{
		int x,n,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("for y=x^n");
		System.out.println("Give the value of base x");
		x=sc.nextInt();
		System.out.println("Give the value of power n");
		n=sc.nextInt();
		y=power(x,n);
		System.out.println("The Answer is "+y);

	}//main

	public static int power(int x,int n)
	{
		if(n==0)
		return 1;	
		else if(n==1)
		return x;
		else 
		return x*power(x,(n-1));
	}//powerf

}//class