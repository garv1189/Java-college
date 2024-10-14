import java.util.*;
class Rad 
{
	protected  float r;
	public Rad(float x)
	{
		r=x;	
	}
}

class Dim2 extends Rad
{
	public Dim2(float r)
	{
		super(r);
	}
	
	protected float a;
	public void area()
	{
		a= 3.14f*r*r;
	}
	public void put()
	{
	
		System.out.println("Area of circle is: "+a);
		
	}
	

}
	
class Dim3 extends Dim2
{
	private float vol;
	public Dim3(float r)
	{
		super(r);
	}

	public void volume()
	{
		vol= a*(4/3f)*r;
	}
	public void put()
	{
		super.put();
		System.out.println("Volume of sphere is: "+vol);
	}
}
	
class AreaInhPara
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Garv Trivedi - 60009220047");
		float x;
		System.out.println("Enter radius");
		x=sc.nextFloat();
		Dim3 d=new Dim3(x);
		d.area();
		d.volume();
		d.put();
	}
}
