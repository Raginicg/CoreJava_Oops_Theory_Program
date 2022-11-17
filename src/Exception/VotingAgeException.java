package Exception;
/**@author ragigupt
 */

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		System.out.println(msg);
	}
}
public class VotingAgeException {
	public static void main(String[] args) {
		// vote(12); // main method call the vote function--->because age is less then 18
		// for that wise, I placed the vote function or risky statement in the try catch block
		
		try {
			vote(12);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void vote(int age ) throws InvalidAgeException // exception object-->user defined exception
	{
		if(age<18) {
			// creating exception object // throw used to throw exception object
			throw new InvalidAgeException("Not eligible for voting"); // User define exception
		}
		else {
			System.out.println("Eligible for voting");
		}
	}

}
