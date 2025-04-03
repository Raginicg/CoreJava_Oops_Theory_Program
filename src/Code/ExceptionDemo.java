package Code;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2/0);
//		 After this-->line is not executed. Because ArithmeticException is occur in line 2/0--->but below line not executed
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(4);
	}
}
