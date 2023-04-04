package basic_oops_concept;
/**@author ragigupt
 */

/*
 * Interface is blueprint of class. It has static, constant, abstract method.
 * The interface in java is used to achieve abstraction and multiple inheritance.
 * 
 */
interface Bank {
	float rateOfInterest();
}
class Sbi implements Bank{
	public float rateOfInterest() {
		return 9.1f;
	}
}
class Hdfc implements Bank{
	public float rateOfInterest() {
		return 2.10f;
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
    Bank b=new Sbi();
    System.out.println("Rate of Interest "+b.rateOfInterest());
    Bank b1=new Hdfc();
    System.out.println("Rate of Interest "+b1.rateOfInterest());
	}

}
