package solid;
/**
 * Creational---> Related to the way of creating an object.
 * 1. Factory Method--> We dont expose the creation logic to the Client and refer the created object using a standard interface.
 * steps-
 * Create main class which call factory class.
 * Factory class returns required class instance.
 * 
 * Abstract Factory- Factory of factory
 * 
 * Builder
 * Prototype
 * Singleton-->
 * 
 * Behavioral
 * 
 * Structural
 * 
 * J2EE
 */
public class DesignPatternInJava {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
	    System.out.println(i);
	}

	int x=10;
	x=x++; // increment the value but after some time again its assign the original X value because in the starting we declare x=10
	System.out.println(x);
}
}
