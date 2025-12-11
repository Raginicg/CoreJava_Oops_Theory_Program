//package Code;
//
//import java.util.Scanner;
//class MyException extends Exception {
//	public MyException(String msg) {
//		super(msg);
//	}
//}

//public class CustomException {
//	public static void main(String args[]) throws MyException {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter age");
//	
//			int age = sc.nextInt();
//			if (age > 100) {
//				throw new MyException("More then 100 not allowed");
//		}	
//	}
//}

/**
 * We can directly used throws keyword with method signature, if not want then we need to used with try catch block
 * 
 */
package Code;

import java.util.Scanner;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

public class CustomException {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		try {
			int age = sc.nextInt();
			if (age > 100) {
				throw new MyException("More then 100 not allowed");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}

//public class CustomException {
//    public static void main(String[] args) {
//        throw new RuntimeException("Boom");
//    }
//}  
// Output-Exception in thread "main" java.lang.RuntimeException: Boom at Code.CustomException.main(CustomException.java:57)