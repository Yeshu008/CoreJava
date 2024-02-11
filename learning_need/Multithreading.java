//package learning_need;
                            //implements Runnable
public class Multithreading  extends Thread{
    // Java code for thread creation by extending
// the Thread class

	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}

}//main
public class Multithread {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Multithreading object
				= new Multithreading();
			object.start();//start invokes run
            /*    = new Thread(new MultithreadingDemo());
            object.start(); */
		}
	}
}