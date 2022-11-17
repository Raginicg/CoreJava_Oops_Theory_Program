package Basic;

/**
 * 
 * @author ragigupt
 *
 */
// --you can create class or interface both but in diff file
// --Can not create the object of the abstract class or instantiated
// --It has static, constant, abstract method.
abstract class Bank1 // abstract class
{ 
	public abstract void loan(); // abstract method---> No body
	
	// --------------Non abstract method-------------------------- credit and debit common foe all
	public void credit() {   // Method body
		System.out.println(" credit method ");
	}

	public void debit() {    // method body
		System.out.println(" debit method ");
	}
}

// Another class
 class Abc extends Bank1{
	@Override      // Abc bank have responsibility to define the loan method, if you dont define then its giving error.
	public void loan() {
		System.out.println(" Loan method ");
	}
	
}
// Test class
public class AbstctclassBankDemo {
public static void main(String[] args) {
	
	Abc a=new Abc();
	a.credit();
	a.debit();
	a.loan();  // overriden method

 // Dynamic polymorphism --->Or you can do this way also
 	Bank1  b1=new Abc();
 	b1.credit();
 	b1.debit();
 	b1.loan();

}
}
