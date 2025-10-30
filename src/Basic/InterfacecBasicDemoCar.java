package Basic;

public interface InterfacecBasicDemoCar {

	// ------------------Variable example----------------
	int wheels=4;
	/**
	 * An interface is a reference type in Java, similar to a class, that can contain only constants, 
	 * method signatures, default methods, static methods, and nested types.
	 */
	/*
	 * Interface is prototype or blueprint of class. Only you declare the method not define.
	 * ----Always define abstract method
	 * ----No method body present
	 * ----Only method declaration present
	 * ----We achieve 100 % abstraction using interface 
	 * ----Can not create the object of abstract class and interface 
	 * ---- in interface final and static variable is define
	 */
	// by default in interface all the method are abstract you don't need to write the abstract keyword
	public void start(); 
	public void stop();
	public void refuel();
	
}
