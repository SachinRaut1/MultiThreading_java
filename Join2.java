package Prevent_Thread_Methods;

public class Join2 extends Thread
{
	static Thread t;
	@Override
	public void run() 
	{
		
		try
		{
			t.join();//here child thread wait for completion of main thread.
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread: "+i);
				Thread.sleep(1500);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		t=Thread.currentThread();//main thread object
		
		Join2 j=new Join2();
		j.start();
		
		//j.join();//here main thread wait for child execution task and then get execute.
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("main thread: "+i);
				Thread.sleep(1500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
//{...join() method:-a thread want to wait for another thread to complete it's task the you can execute.}