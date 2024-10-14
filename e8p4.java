import java.util.*;
class Obj
{
	
	public void finalize()
	{
		System.out.println("object has been deleted");
	}
}

class e8p4
{
	public static void main(String args[])
	{
		System.out.println("Garv Trivedi - 60009220047");
Obj o=new Obj();
		o=null;
		System.gc();
	}
}
