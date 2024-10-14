import java.io.*;
import java.util.*;

class Vector1
{
	public static void main(String [] args)
	{
	
		int n=5;
		Vector<Integer> v = new Vector<Integer>(n);
		for (int i = 1; i <= n; i++)
			v.add(i);
		System.out.println(v+ "This is after adding");
		v.remove(2);
		v.remove(3);
		System.out.println(v+ "This is after removing");
		
	}	
		
}