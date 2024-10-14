import java.util.*;
class Table extends Thread
{
	private int i,n;
	public Table(int x)
	{
		n=x;
	}
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}
}

class e11p1
{
	public static void main(String args[])
	{
		System.out.println("Garv Trivedi - 60009220047");
Scanner sc=new Scanner(System.in);
		Table t1=new Table(5);
		Thread th1=new Thread(t1);
		th1.start();
		try
		{
			th1.join();
		}
		catch(InterruptedException IE)
		{
		}
		Table t2=new Table(7);
		Thread th2=new Thread(t2);
		th2.start();
		try
		{
			th2.join();
		}
		catch(InterruptedException IE)
		{
		}
		Table t3=new Table(13);
		Thread th3=new Thread(t3);
		th3.start();
	}
}
