import java.util.*;
class E5p1ns
{
	int power(int x,int n)
	{
		if (n==0)
			return 1;
		else
		 	return  (x*power(x,n-1));
	}

	public static void main(String args[])
	{
		int x,y,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		System.out.println("Enter x and n: ");
		x=sc.nextInt();
		n=sc.nextInt();
		E5p1ns p=new E5p1ns();
		y=p.power(x,n);
		System.out.println("y= "+y);
	}
}
