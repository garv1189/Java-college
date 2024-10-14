import java.util.*;
class e2p1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		int a[]=new int[30];
		int n,i,j;
		int sum=0;
		System.out.print("Enter Number of Elements: ");
		n=s.nextInt();
		System.out.println("Enter Elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The Given Array is: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("The array after addition is: ");
		for(i=0;i<n;i++)
		{
			for (j=0;j<n;j++)
			{
				if(j!=i)
				{
					sum+=a[j];
				}
			}
			System.out.print(sum+" ");
			sum=0;
		}
	}
}
