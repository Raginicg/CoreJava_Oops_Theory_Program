package Code;

import java.util.Scanner;

// Program- In this only the exception object is print, but its not handled, its handle by default handler.
//class VotingException extends RuntimeException // RuntimeException used means its a Unchecked exception
//// Throw- If you used throw keyword that means You are using Custom or User defined exception
//{
//	VotingException(String msg){
//		super(msg);
//	}
//}
//public class CustomThrowException {
//	public static void main(String[] args) {
//		int age=16;
//		if(age< 18) {
//			throw new VotingException("You are not eligible");
//		}
//		else {
//			System.out.println( "Eligible");
//		}
//	}
//}

/*
 * using Try cath block only we handle the exception
 */
class VotingException extends RuntimeException // RuntimeException used means its a Unchecked exception
//Throw- If you used throw keyword that means You are using Custom or User defined exception
{
VotingException(String msg){
	super(msg);
}
}
public class CustomThrowException {
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		
		if(age< 18) {
			throw new VotingException("You are not eligible");
		}
		else {
			System.out.println( "Eligible");
		}
	}
	catch (ArithmeticException e) {
		e.getStackTrace();
	}
}
}