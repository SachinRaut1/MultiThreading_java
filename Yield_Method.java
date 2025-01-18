package Prevent_Thread_Methods;

public class Yield_Method extends Thread {
	@Override
	public void run() 
	{
		// if we want to stop the current thread [...child chread...]
		// and give chance to other thread for execution

		// Thread.yield();

		for (int i = 1; i <= 6; i++) 
		{
			System.out.println("child thread");
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args)

	{
		Yield_Method y = new Yield_Method();
		y.start();

		Thread.yield();
		// yield() stop the current execution and give chance to other thread for execution.
		//in jaava 6:=>...Thread provides a hint to thread Schedular ,
		//then it depends on Thread schedular to accept or ignore the hint.
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("main thread");
			System.out.println(Thread.currentThread().getName());
		}

	}

}
