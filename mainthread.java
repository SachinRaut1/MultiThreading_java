package multiplethread;


public class mainthread {

	public static void main(String[] args) {
		
		thread1 m1=new thread1();
		m1.start();
		
		Thread2 m2=new Thread2();
		m2.start();
		
		thread3 m3=new thread3();
		m3.start();
		
		//m3.start();

	}

}
