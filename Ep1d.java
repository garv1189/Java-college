import java.util.*;
class Ep1d
{	
	public static void main(String args[])
	{
		System.out.println("Garv Trivedi - 60009220047");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		char m,tf;
		do
		{
			System.out.println("Enter 2 numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Enter the operation");
			sc.nextLine();
			m=sc.nextLine().charAt(0);
			switch(m)
			{
				case '+' :
					c=a+b;
					System.out.println("Sum is : "+c);
					break;
				case '-':
					c=a-b;
					System.out.println("Difference is: "+c);
					break;
				case '*':
					c=a*b;
					System.out.println("Product is: "+c);
					break;
				case '/':
					c=a/b;
					System.out.println("Quotient is: "+c);
					break;
				default:
					System.out.println("Invalid");
					break;
			}	
			System.out.println("Do you want to continue y/n?");
			tf=sc.nextLine().charAt(0);

			}while(tf=='y');
	}
}
