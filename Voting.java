import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException()
	{
		System.out.println("Your age must be 18");	
	}	
} 

class Voting
{
	public static void main(String [] args)	
	{
		System.out.println("Enter your age ");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("Entered age is"+i);
		
		try
		{
			if(i<18)
			{
				throw new UnderAgeException();
			}
			else
			{
				System.out.println("Vote casted");
			}
		}
	
		catch(UnderAgeException e)
		{
			//e.printStackTrace();
			System.out.println("Vote cannot be casted");
				
		}
	
	}
	
}