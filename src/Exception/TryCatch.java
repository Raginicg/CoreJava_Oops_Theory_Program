package Exception;

public class TryCatch {

	/**
	 * try--> Used to specify a block where we should place an exception code.We cant used try block alone.
	 * 
	 * catch- Its is used to handled the exception. 
	 * 
	 * finally- It is used to execute the necessary code of the program.
	 * 
	 * throw-The throw keyword is used to throw an exception.
	 * 
	 * throws- The throws keyword is used to declare exceptions. 
	 */
	public static void main(String[] args) {
		
		try{
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
		System.out.println("When error occure then also this print statemnet is executed because I have handle the exception");
	}

}
