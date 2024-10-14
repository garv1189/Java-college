class Fibo extends Thread 
{
		int n=10,arr[];
		
		public void accept(int n)
		{	
			this.n = n;
			arr = new int[n];
		}
		
		public void run ()
		{
			synchronized(arr)
			{
				for(int i=0 ; i<n ; i++)
				{
				
					if (i==0) 	arr[i]= 0;
			
					else if (i==1) 	arr[i]= 1;
			
					else arr[i] = arr[i-2] + arr[i-1];
			
					try				
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
					}
				}
			arr.notify();
			}
		}
			
} 

class Input extends Thread
{
	Fibo f;
	int n=10;
	public Input(Fibo x)
	{
		f = x;
		f.accept(n);
	}

	public void run ()
	{
		int i;
		
		synchronized(f.arr)
		{
			try
			{
				f.arr.wait();
			}
			catch(Exception e)
			{
			}

			for(i=0;i<f.n;i++)
			{
				System.out.println(" "+f.arr[i]);
			}
		}
	}
	
	
}

class e11p3
{
	public static void main(String[] args)
	{
		System.out.println("Garv Trivedi - 60009220047");
Fibo f = new Fibo();
		Input i = new Input(f);
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(i);
		t2.start();
		t1.start();
		
	}
}
