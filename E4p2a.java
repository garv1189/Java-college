import java.util.*;
class E4p2a
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		int n,i,j;
		System.out.println("Enter number of strings");
		n=sc.nextInt();
		ArrayList stud=new ArrayList();
		System.out.println("Enter Strings");
		sc.nextLine();
		while(n!=0)
		{	
			String str= sc.next();
			stud.add(str);
			n--;
		}
		sc.nextLine();
		System.out.println("Enter another String");
		String str2=sc.nextLine();
		i=stud.indexOf(str2);
		if(i==-1)
			stud.add(str2);
		else
			stud.remove(i);
		System.out.println("Final list:");
		for(j=0;j<=stud.size()-1;j++)
		{
			System.out.println(stud.get(j));
		}
	}
}
