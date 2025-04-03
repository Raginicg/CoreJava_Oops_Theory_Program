package Exception;

public class TryCatch {

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
