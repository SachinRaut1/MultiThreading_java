package Multi_Threading;

public class STaskSThread extends Thread
{
	
		public void run() 
		{
			System.out.println("single task for one thread");
		}
	
	

	public static void main(String[] args) 
	{
		STaskSThread st=new STaskSThread();
		st.start();
		
		

	}

}
