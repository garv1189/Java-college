import java.util.*;

class Exam1
{
	public static void main(String [] args)
	{
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}

			for(k=0;k<=n-i-1;k++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
		


	}//main

}//class