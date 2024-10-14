import java.io.*;
class e10p1
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("Garv Trivedi - 60009220047");
 		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 2 numbers: ");
		int n1,n2,q=0;
 		try 
		{
			n1=Integer.parseInt(br.readLine());	
			n2=Integer.parseInt(br.readLine());
			q=n1/n2;
		}
			
		catch (NumberFormatException NE) 
		{
 			System.out.println("Please enter integer");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Cant divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Index out of bounds");
		}
	
	}
}
