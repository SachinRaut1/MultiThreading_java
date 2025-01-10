package Multi_Threading;//thread present in java.lang.package

//step1=>implements the runnable interface
public class RunnableInterf implements Runnable

{
	
	//2) override the run method
		public void run()
		{
			System.out.println("run started");
		}
	
	

	public static void main(String[] args) 
	{
		//step3=>create the object of the class
		RunnableInterf ri=new RunnableInterf();
		
		//step4=>create an object an thread class and pass parameter in constructor
		Thread th=new Thread(ri);
		//step5=> invoke the run method using start() method
		th.start();

	}


	
		
	}


