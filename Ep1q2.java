import java.util.Scanner;
class Ep1q2
{
	public static void main(String args[])
	{
		int a,b,c,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		System.out.println("Enter 3 Numbers");	
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		max= (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Greatest number is: " +max);
	}
}
