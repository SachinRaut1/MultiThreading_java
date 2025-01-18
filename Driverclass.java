package Prevent_Thread_Methods;

public class Driverclass {

	 public static void main(String[] args) throws InterruptedException 
		{
		 System.out.println("main thread");
			joinMedical m=new joinMedical();
			m.start();
			m.join();
			
			Licence l=new Licence();
			l.start();
			l.join();
			
			TestDrive td=new TestDrive();
			td.start();
			td.join();
		}

}
