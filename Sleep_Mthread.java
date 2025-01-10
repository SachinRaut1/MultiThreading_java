package Prevent_Thread_Methods;

public class Sleep_Mthread extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				//Thread.sleep(1000); this is native method and static method
				Thread.sleep(1000,999999);//java method
				System.out.println("child thread:"+i);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) 
	{
		Sleep_Mthread s=new Sleep_Mthread();
		s.start();
		
		

	}

}
