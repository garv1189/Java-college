import java.util.*;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		System.out.println("Number must be more then 18");	
	}
}

class Test
{
	public static void vote(int age) throws InvalidAgeException
	{	
		if(age<18)
		{
			throw new InvalidAgeException("Not eligible for voting");
		}
	
		else
		{
			System.out.println("Eligible for voting");
		}
	}
		
	public static void main(String [] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age of person");
			int age=sc.nextInt();
	
			vote(age);	
		}
	
		catch(InvalidAgeException e)
		{}
	}
}