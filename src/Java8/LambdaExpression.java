package Java8;

public class LambdaExpression {

	public static void main(String[] args) {
	// Creating a new thread using an anonymous class implementing Runnable
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello");
            }
        }).start(); 
        
        /*
    	 * Lambda expressions allow you to write concise code (short functions) that can be passed around as arguments, helping to reduce boilerplate code.
    	Syntax: (parameters) -> expression

		Using lambda expression
    	 */
        new Thread(() -> System.out.println("Hello")).start();
    }

	
}
