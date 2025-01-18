package Prevent_Thread_Methods;

public class joinMedical extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("medical test Started: "+i);
				Thread.sleep(2000);
				System.out.println("Medical test completed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Licence extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Licence learning in process: "+i);
				Thread.sleep(3000);
				System.out.println("Licence learning Completed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class TestDrive extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("test Drive Started: "+i);
				Thread.sleep(4000);
				System.out.println("test Drive Completed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

 


