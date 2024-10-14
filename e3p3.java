import java.util.*;
class e3p3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		String a,rev;
		System.out.print("Enter a String: ");
		a=sc.nextLine();
		StringBuffer sb=new StringBuffer(a);
		sb.reverse();
		rev=sb.toString();
		if(a.equals(rev))
		System.out.println("Its a Palindrome.");
		else
		System.out.println("Its Not a Palindrome.");
	}
}
