package Without_Synchronization;

class BookTheaterSeat
{
	int total_seats=10;
	synchronized void bookseat(int seats)
	{
		if(total_seats>=seats)
		{
			System.out.println("seats booked successfuly");
			total_seats=total_seats-seats;
			System.out.println("total seats left :"+total_seats);
		}
		else
		{
			System.out.println("sorry seats are not available");
			System.out.println("total seats left :"+total_seats);
		}
	}
	
}

public class MovieBookApp extends Thread
{
	static BookTheaterSeat bts;
	int seats;
	@Override
	public void run() 
	{
		bts.bookseat(seats);
	}

	public static void main(String[] args) 
	{
		
		 bts=new BookTheaterSeat();
		 
		 MovieBookApp person1=new MovieBookApp();
		 person1.seats=7;
		 person1.start();
		 
		 MovieBookApp person2=new MovieBookApp();
		 person2.seats=6;
		 person2.start();

	}

}
