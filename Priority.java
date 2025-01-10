package Priority_Threads;

public class Priority extends Thread
{
	@Override
	public void run() 
	{
		System.out.println(" Old Child thread priority:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(3);
		System.out.println("cild Thread");
		System.out.println("New Child thread priority:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	{
		System.out.println("old parent thread Priority:"+ Thread.currentThread().getPriority());
		System.out.println("Parent thread");
		Thread.currentThread().setPriority(9);
		System.out.println("new priority parent thread:"+ Thread.currentThread().getPriority());
		
		
		
		Priority p=new Priority();
		//....Constant define in thread class....
		//p.setPriority(MAX_PRIORITY);
		//p.setPriority(MIN_PRIORITY);
		//p.setPriority(NORM_PRIORITY);
		
		//p.setPriority(0);//it will throw run-time Exception [...IllegalArgumentException...]
		
		//System.out.println(" child Thread priority:"+ p.getPriority());
		
		
		p.start();
		

	}

}
