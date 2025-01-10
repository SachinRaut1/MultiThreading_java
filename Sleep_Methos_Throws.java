package Prevent_Thread_Methods;

public class Sleep_Methos_Throws {

	public static void main(String[] args) throws InterruptedException
	{
		for(int i=1; i<=8;i++)
		{
			System.out.println("main thread :"+ i);
			Thread.sleep(1000);
		}
		
		

	}

}
