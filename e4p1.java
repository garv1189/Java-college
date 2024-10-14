import java.util.*;
class e4p1
{
	public static void main(String args[])
	{
		int i;
		Vector vec = new Vector();
		System.out.println("Garv Trivedi - 60009220047");
		for(i=0;i<args.length;i++)
		{
			vec.addElement(args[i]);
		}
		System.out.println("Names entered are: ");
		for(i=0;i<vec.size();i++)
		{
			System.out.println(vec.elementAt(i));
		}
	}
}

