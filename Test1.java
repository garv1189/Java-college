class Test1 extends Thread
{
		public void run(int x)
		{
			System.out.println("The table of "+x);
			
			for(int i=1;i<=10;i++)
			{
					
				System.out.println(x+"x"+i+"="+(i*x));
			}
		}
	

	public static void main(String [] args)
	{
		Test1 t1=new Test1(3);
		Test1 t2=new Test1(5);
	
		t1.start();
		t2.start();
	
	}	
	
}