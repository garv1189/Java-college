import java.util.*;

class AgeException extends Exception
{
	public AgeException(String str)
	{
		super(str);
	}	
}

class Test2
{
	public static void voteAge(int age)
	{
		if(age<18)
		throw new AgeException("Voting Unsuccessful");

		else 
		System.out.println("Voting successful");
	
		
	}

	public static void main(String [] args)
	{
		try{
			
			voteAge(13);
		}
		catch(Exception e)
		{}
	}
	
	
	
}