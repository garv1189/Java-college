import java.util.*;

class MarksOutOfBoundsException extends Exception 
{
	MarksOutOfBoundsException(String message) 
	{
 		super(message);
	}
}

class e10p2 
{
	public static void main(String[] args) 
	{
		System.out.println("Garv Trivedi - 60009220047");
Scanner s = new Scanner(System.in);
		System.out.print("Enter Marks :");
		int marks = s.nextInt();
		try 
		{
			if (marks < 0 || marks > 100) throw new MarksOutOfBoundsException("Marks should be between 0 and 100."); 
			System.out.println("Marks: " + marks);
		}
		catch (MarksOutOfBoundsException e) 
		{
			System.out.println("MarksOutOfBoundsException occurred: " + e.getMessage());
 			
 		}
	}
}
