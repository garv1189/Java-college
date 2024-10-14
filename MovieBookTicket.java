class BookTicket
{
	int total=10;

	synchronized public void bookSeat(int seat)
	{
		if(total>=seat)
		{
			System.out.println("Seat Booked");
			total=total-seat;
			System.out.println("Seat Remaining"+total);
		}
		
		else
		{
			System.out.println("Seat Not Booked");
			System.out.println("Seat Remaining"+total);
		}
	
	}
}

class MovieBookTicket extends Thread
{
	static BookTicket b=new BookTicket();;
	int seat;
	
	public void run()
	{
		b.bookSeat(seat);
	}

	public static void main(String [] args)
	{	
		MovieBookTicket m1=new MovieBookTicket();
		m1.seat=7;
		m1.start();
	
		MovieBookTicket m2=new MovieBookTicket();
		m2.seat=5;
		m2.start();
	
	}
}