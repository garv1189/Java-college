import java.util.*;
class TicketBooking
{
	int tickets =1;

	synchronized public void booking(String name)
	{
		
		if (tickets> 0) 
		{
            	
            		tickets--;
            		System.out.println("\n" + name + " Ticket has been booked");
		
		}
		
		else
		{
			System.out.println(name+" : Sorry but the tickets are not availible");
		}

		
	} 
}
		
  class Passenger extends Thread
  {
	String name;
	TicketBooking ticket;
		
	Passenger(TicketBooking t , String name)
	{
		ticket = t;
		this.name = name;
	}
		
	public void run ()
	{
		ticket.booking(name);
	}
	

 }

class e11p4
{
	public static void main(String args[])
	{
		System.out.println("Garv Trivedi - 60009220047");
Scanner sc = new Scanner(System.in);
		String name1,name2 ;
		System.out.println("Enter two names :");
		name1 = sc.nextLine();
		name2 = sc.nextLine();
		TicketBooking obj = new TicketBooking();
		Passenger p1 = new Passenger(obj,name1);
		Passenger p2 = new Passenger(obj,name2);
		p1.start();
		p2.start();
		sc.close();
		
	}
}
