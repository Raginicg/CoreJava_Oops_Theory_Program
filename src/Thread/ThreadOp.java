package Thread;

public class ThreadOp {

	public static void main(String[] args) {
		int a=20+30;
		System.out.println("Addition is "+ a);
		Thread name=Thread.currentThread();  // currentThread is static method because of that I have used class.method name
		String t=name.getName();
		System.out.println("Name of Bydefault thread if i am not used any thread in main "+ t);
		// setting the Thread name
		name.setName("Main method thread");
		String renameth=name.getName();
		System.out.println("After setting the Thread name "+ renameth);
	}

}
