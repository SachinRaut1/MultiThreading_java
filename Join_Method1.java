package Prevent_Thread_Methods;

public class Join_Method1 extends Thread
{
	@Override
	public void run() 
	{
		
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread :"+ i);
				Thread.sleep(2000);
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		Join_Method1 j=new Join_Method1();
		j.start();
		
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Main thread :"+ i);
				Thread.sleep(2000);
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
