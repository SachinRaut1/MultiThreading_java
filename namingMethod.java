package Thread_NamingMethods;

public class namingMethod {

	public static void main(String[] args) {
		
		//thread is a interface
		//currentthread() it is a static method
		//it provide thread interface refrence
		//getName() it is a thread method which is use to get  thread name
		System.out.println(Thread.currentThread().getName());
		
		
		//set() is used to set the thread name whatever you want to give it
		//it is a final and synchronized method
		Thread.currentThread().setName("sachin");
		
		
		System.out.println("new thread name: "+Thread.currentThread().getName());//new thread sachin ,i have created
		
		System.out.println(10/0);//exception in thread sachin

	}

}
