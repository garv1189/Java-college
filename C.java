import java.util.*;

class A
{
	public A()
	{
		System.out.println("Good");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("Morning");
	}

}

class C extends B
{
	public static void main(String [] args)
	{
		A a=new A();
		B b=new B();

	}
}