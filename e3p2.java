import java.util.*;
class e3p2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		String a;
		char ch;
		int cnt=0;
		System.out.print("Enter a String: ");
		a=s.nextLine();
		System.out.print("Enter the Letter: ");
		ch=s.next().charAt(0);
		for (int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==ch)
			cnt++;
		}
		System.out.println(ch+"occurs in the string is "+cnt+" times.");
	}
}
