package Code;

/**
 * Abstraction- Hiding implementation details and showing only the essential functionality
 * Ability of an object to show only the functionality rather then the logic.
 * 
 * We can achieve abstraction in 2 ways- abstract class as well as interface
 * abstract class using 50 % abstraction we can achieve
 * Using Interface 100 % abstraction
 */

// whenever we create the abstract method COMPULSORY to create a abstract class
abstract class Teacher{
	abstract void tech();
	// It contains static, abstract and non-abstract method
}
public class AbstractExp extends Teacher {

	@Override
	void tech() {
		System.out.println("50 % abstaction achieve using abstact class");
	}

}

// 100% abstraction we can achieve

interface Test{
//	100 percentage abstraction because non static, instance method is not present

	abstract void m1(); //----->by default it was public static final
	public static final int a=10;
}

class Fullabstraction implements Test{

	@Override
	public void m1() {
		System.out.println("Fully abstraction");
	}
	
	
}
