package Thread_NamingMethods;

public class userThread extends Thread
{
	@Override
	public void run() 
		{
		//thread -0
		//task 2 excute sunil
		//Thread.currentThread().setName("sunil");
			System.out.println("Thread task2: "+Thread.currentThread().getName());
		}
	//we can change thread name in run method also

	public static void main(String[] args) 
	{
		//task1 execute main thread 
		System.out.println("thread task1: "+Thread.currentThread().getName());
		userThread t1=new userThread();
		t1.setName("raut");
		t1.start();
		
		
		userThread t2=new userThread();
		t2.setName("sachin");
		t2.getName();
		t2.start();
		
		//t2.getName();
		//System.out.println(Thread.currentThread().getName());//get current thread name
		System.out.println("tct :-> "+ Thread.currentThread().isAlive());//return boolean value
		System.out.println("using object refrence:->"+  t2.isAlive());//same output but using object refrence
		//we can change thread name using object refrence
	}

}
