import java.util.*;
class Count
{
	private static int count;
	public Count()
	{
		count++;
	}
	
	public static void display()
	{	
		System.out.println("Count: "+count);
	}
	
	public void finalize()
	{
		System.out.println("In Finalize method");
	}
}

class e6p1
{
	public static void main(String args[])
	{
		System.out.println("Garv Trivedi - 60009220047");
Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		Count c4=new Count();
		Count.display();
		c1=null;
		c2=null;
		System.gc();
	}
}
