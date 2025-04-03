package Exception;

public class MethodPException {

	public static void main(String[] args) {
		try {
			int a=100;
			int b=0;
			int result;
			result=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace(); // print all the details
			System.out.println(e.toString());
			System.out.println(e.getMessage()); // only description
			System.out.println(e.getStackTrace());
		}
		
	}

}
