package Multi_Threading;

//step1=>extends the thread class
public class ThreadClass extends Thread {
	
	//step2=>overide the run method
		public void run()
		{
			System.out.println("thread start to run");
		}
	

	public static void main(String[] args)
	{
		//step3=>creat an object of class
		ThreadClass t=new ThreadClass();
		//step4=> start the thread or call/invoke the run method
		t.start();


		

	}

}
