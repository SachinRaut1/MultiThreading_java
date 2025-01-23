package inter_thread_communication;
class totalEarnings extends Thread
{
	int total=0;
	@Override
	public void run() 
	{
		synchronized (this) 
		{
			for(int i=1;i<=10;i++)
			{
				total=total+100;
			}
			this.notify();
		}
		
	}
}
public class MovieBookApp {

	public static void main(String[] args) throws InterruptedException 
	{
		totalEarnings te=new totalEarnings();
		te.start();
		
		
		
		synchronized (te) 
		{
			
			te.wait(1000);
			System.out.println("TotalEarning: "+te.total+" rs");
			
		}

	}

}
