import java.util.Scanner;
	
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

class MovieBookTicket1 extends Thread
{
	static BookTicket b=new BookTicket();;
	int seat;
	
	public void run()
	{
		b.bookSeat(seat);
	}

	public static void main(String [] args)
	{	
		Scanner sc=new Scanner(System.in);
		
		MovieBookTicket1 m1=new MovieBookTicket1();
		System.out.println("Enter number of tickets for 1");
		m1.seat=sc.nextInt();
	
		MovieBookTicket1 m2=new MovieBookTicket1 ();
		System.out.println("Enter number of tickets for 2");
		m2.seat=sc.nextInt();
		
		m1.start();
		m2.start();
	
	}
}