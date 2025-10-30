package Thread;
/**
 * Multithreading- Executing multiple threads at a single time.
 * eg-Gaming, animation
 */
public class MultiThreading implements Runnable {

	/**
	 * We can create Thread using two ways.
	 * Thread Class and Runnable interface
	 * If I am using Thread then I need to create two object, one for New class and other for Thread class and passing that newly thread 
	 * class object into Thread class
	 * 
	 */

	@Override
	public void run() {
	System.out.println("Task for Thread");
	for(int i=0; i<=10; i++) {
		System.out.println("value of i" + i);
		try {
			Thread.sleep(20);  // thread will sleep but if we used sleep method then we need to used try catch block
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
public static void main(String[] args) {
	// my thread class
		MultiThreading m=new MultiThreading();
		// I need to create the object of Thread class if i am using Runnable interface
		Thread t=new Thread(m);
		t.start();
		System.out.println("NAME OF THREAD" +t.getName());
		ThreadClass tc=new ThreadClass();
		tc.start();
	}
}

class ThreadClass extends Thread{
	public void run() {
		System.out.println("Thread creation using Thread class");
		for (int i=10; i>=1; i--) {
			System.out.println("I after decrement"+ i);
			try {
				Thread.sleep(20);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
