package Daemon_Thread;

public class daemon_Thread extends Thread
{
	@Override
	public void run() {
		//System.out.println("Daemon thread");
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread");
		}
		else
		{
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) 
	{
		//we cannot create main thread as a Daemon Thread.
		
		//Thread.currentThread().setDaemon(true);//illegalThreadStateException
		
		System.out.println("main thread");
		
		daemon_Thread dt=new daemon_Thread();
		//we have to create Daemon thread before the starting the thread.
		dt.setDaemon(true);
		dt.start();
				
		//dt.setDaemon(true); if we create Daemon thread after starting thread ,then it 
		//will throw an Exception which is[...IllegalThreadStateException...]

	}

}
