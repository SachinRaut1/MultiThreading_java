package Prevent_Thread_Methods;

public class SleepStart_run extends Thread
{
	@Override
	public void run() 
	{
		try 
		{
			//multiple thread run at a time
			for(int i=1;i<=5;i++)
			{
				Thread.sleep(1000);
				System.out.println(i+" :"+Thread.currentThread().getName());
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}
	

	public static void main(String[] args) 
	{
		SleepStart_run s=new SleepStart_run();
		s.start();
		
		SleepStart_run r=new SleepStart_run();
		r.start();
		
		System.out.println("....run method executs one after anoher....");
		SleepStart_run s1=new SleepStart_run();
		s1.run();
		
		SleepStart_run r1=new SleepStart_run();
		r1.run();
		

	}

}
