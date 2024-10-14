import java.util.*;
class Complex
{
	private float real,img;
	public Complex()
	{
	}
	public Complex( float x, float y)
	{
		real=x;
		img=y;
	}
	
	public Complex AddC( Complex c)
	{
		Complex z=new Complex();
		z.real=real+c.real;
		z.img=img+c.img;
		return z;
	}
	
	public Complex SubC( Complex c)
	{
		Complex z=new Complex();
		z.real=real-c.real;
		z.img=img-c.img;
		return z;
	}
	public void put()
	{
		if(img>=0)
			System.out.println("Complex Number: "+real+"+"+img+"i");
		else
			System.out.println("Complex Number: "+real+img+"i");
	}
}
class e5p3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		float x,y;
		System.out.println("Enter real and imaginary part of first number");
		x=sc.nextFloat();
		y=sc.nextFloat();
		Complex c1=new Complex(x,y);
		System.out.println("Enter real and imaginary part of second number");
		x=sc.nextFloat();
		y=sc.nextFloat();
		Complex c2=new Complex(x,y);
		Complex c3;
		c3=c1.AddC(c2);
		c3.put();
		c3=c1.SubC(c2);
		c3.put();
	}
}
