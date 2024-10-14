class Ep1c
{
	public static void main(String args[])
	{
		long n;
		int c=8;
		System.out.println("Garv Trivedi - 60009220047");
		n= Long.parseLong(args[c]);
		while (n!=0)
		{
			c++;
			n=n/10;
		}
		System.out.println("Number of digits: "+c);
	}
}	
	