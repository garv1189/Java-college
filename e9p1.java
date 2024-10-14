import java.util.*;
abstract class Shape
{
	protected float a,b,area;
	abstract public void get();
	public void put()
	{
		System.out.println("The area is "+area);
	}
}

class Rectangle extends Shape
{
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		a=sc.nextFloat();
		b=sc.nextFloat();
		area=a*b;
		
	}
}

class Circle extends Shape
{
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		a=sc.nextFloat();
		area=a*a*3.14f;
		
	}
}


class Triangle extends Shape
{
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and height");
		a=sc.nextFloat();
		b=sc.nextFloat();
		area=a*b*0.5f;
		
	}
}

class e9p1
{
	public static void main(String args[])
	{
		System.out.println("Garv Trivedi - 60009220047");
Rectangle r=new Rectangle();
		Circle c=new Circle();
		Triangle t=new Triangle();
		r.get();
		r.put();
		c.get();
		c.put();
		t.get();
		t.put();
	}
}
