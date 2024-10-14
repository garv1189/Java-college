import java.util.*;
class e3p1
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		String a;	
		int u=0,l=0,b=0;
		System.out.print("Enter a String: ");
		a=s.nextLine();
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				u++;
			}
			else if(ch>='a'&&ch<='z')
			{
				l++;
			}
			else if(ch==' ')
			{
				b++;
			}
		}
		System.out.println("The Number of Uppercase characters is: "+u);
		System.out.println("The Number of Lowercase characters is: "+l);
		System.out.println("The Number of Blank Spaces is: "+b);
	}
}
