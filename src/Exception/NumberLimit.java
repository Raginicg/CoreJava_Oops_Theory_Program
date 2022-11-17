package Exception;
/**@author ragigupt
 */

// In this case I am create the custom exception in different class i.e InvalidNumberException
public class NumberLimit  {

	public static void main(String[] args) {
		try {
			Check(30);
			// Check(951);
			// Check(200);
		}
		catch(Exception e) {
			System.out.println(e);
		}
}

public static void Check(int number) throws InvalidNumberException {
	if ((number<0) || (number>100)) {
		throw new InvalidNumberException(number+" is not valid number "+ "Please enter valid number in the range between 0 to 100");
	}
	else {
		System.out.println(number + " is a valid number");
	}
	
	}
}