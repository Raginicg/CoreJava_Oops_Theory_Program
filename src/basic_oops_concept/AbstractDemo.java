package basic_oops_concept;
/** @author ragigupt
 * 
 * Abstraction is the process of hiding the implementation and showing only functionality to the User
 * Only show the essential information and hide the internal details.
 * You can achieve abstraction using two ways----->Using abstract class---->Using Interface
 * 
 * Example- While sending text sms user can not focus on how the message is send.
 * It focus on what the Object is do instead of how it does it. 
 * You can not create the object of abstract class
 */

//-----------------Abstraction demo with abstract class

abstract class Bike // abstract class is created using abstract keyword in starting
{
	abstract void run(); // abstract method always declare with no body
}
//----------------Whenever class is abstract you need to create new class and write the implementation of the that abstract class

// creating different class for writing logic for the abstract method
class Honda extends Bike{
	void run() {  // This method used for Abstract method implementation-->Write method logic below
		System.out.println(" Honda bike is running");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
// object is created using normal class not the abstract class--->because you can't instantiated or create a object of abstract class
	Honda h=new Honda();
	// Bike b=new Bike(); // Its giving error because you cannot create the object of abstract class
	h.run();  //calling method using normal class object
	// b.run();
	}
}
