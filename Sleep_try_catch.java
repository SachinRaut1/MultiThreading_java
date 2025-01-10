package Prevent_Thread_Methods;

public class Sleep_try_catch {

	public static void main(String[] args) 
	{
		try
		{
			for(int i=1;i<=8;i++)
			{
				Thread.sleep(1000);
				System.out.println("main thread :"+i);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
