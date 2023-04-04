package basic_oops_concept;
/**@author ragigupt
 */

/*
 * A child class has the same method as declare in parent class, it is known as method overriding
 */
class Vehicle{ // parent class
	void Run() {
		System.out.println("Vehicle is running");
	}
}
public class MethodOverriding  extends Vehicle{ // child class
	void Run() {
		System.out.println("Bike is running safely");
	}
	public static void main(String[] args) {
	MethodOverriding o=new MethodOverriding(); // child class object
	o.Run();
	Vehicle v=new Vehicle(); // parent class object
	v.Run();
	}
}


