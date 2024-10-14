import java.util.*;
class e2p3
{
	public static void main (String[] args) 
	{
		int i,j,n;
		int a[][]=new int[10][];
		Scanner s=new Scanner(System.in);
System.out.println("Garv Trivedi - 60009220047");
		System.out.print("Enter Number of Rows: ");
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=new int[i+1];
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=j+1;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
