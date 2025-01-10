package Multi_Threading;

public class Stask_MltiThread extends Thread
{
	public void run()
	{
		System.out.println("single task multiple thread");
	}

	public static void main(String[] args) 
	{
		
		Stask_MltiThread sm=new Stask_MltiThread();
		sm.start();
		
		Stask_MltiThread mt=new Stask_MltiThread();
		mt.start();

	}

}
