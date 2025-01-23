package Static_Synchronization;

class BookTheaterSeats
{
	//class level lock it is known as static synchronization
	static int total_seats=20;
	static synchronized void bookseats(int seats)
	 {
		 if(total_seats >= seats)
		 {
			 System.out.println(seats +" :seats booked successfully");
			 total_seats=total_seats -seats;
			 System.out.println("total seats left: "+total_seats);
		 }
		 else
		 {
			 System.out.println("sorry seats are not available");
			 System.out.println(total_seats);
		 }
	 }
}

class mythread1 extends Thread
{
	BookTheaterSeats bts;
	int seats;
	
	public mythread1(BookTheaterSeats bts,int seats)
	{
		this.bts=bts;
		this.seats=seats;
	}
	@Override
	public void run() 
	{
		bts.bookseats(seats);
	}
}
class mythread2 extends Thread
{
	BookTheaterSeats bts;
	int seats;
	
	public mythread2(BookTheaterSeats bts,int seats)
	{
		this.bts=bts;
		this.seats=seats;
	}
	@Override
	public void run() 
	{
		bts.bookseats(seats);
	}
}

public class MovieBookApp {

	public static void main(String[] args) throws InterruptedException 
	{
		BookTheaterSeats bts1=new BookTheaterSeats();
		mythread1 person1=new mythread1(bts1, 7);
		Thread.sleep(2000);
		person1.start();
		
		mythread1 person2=new mythread1(bts1, 6);
		Thread.sleep(2000);
		person2.start();
		
		//(".....................................................");
		
		BookTheaterSeats bts2=new BookTheaterSeats();
		mythread2 person3=new mythread2(bts2, 5);
		Thread.sleep(2000);
		person3.start();
		
		mythread2 person4=new mythread2(bts2, 9);
		Thread.sleep(1000);
		person4.start();
		

	}

}
