import java.util.*;
class e1p1
{
	public static void main(String args[])
	{
		int n;
		Scanner in=new Scanner(System.in);
             	System.out.println("Garv Trivedi - 60009220047");
		System.out.println("Enter a number:");
		n=in.nextInt();
		if(n%2==0)
		{
			if (n>=2&&n<=5)
				System.out.println("Not Weird");
		    else if(n>=6&&n<=20)
		    	System.out.println("Weird");
		    else if(n>20)
		    	System.out.println("Not Weird");
		}
		else
			System.out.println("Weird");
		
	}
}
