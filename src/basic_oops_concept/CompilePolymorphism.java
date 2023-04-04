package basic_oops_concept;
/** @author ragigupt
 * 
 * Ability of any object in a class to perform a particular task in a multiple method.
 * Two types-->Method overloading or Compile time polymorphism
 * 			   Method ovderriding or Run-time polymorphism
 */
//------------------Static binding Or Method overloading Or Compile time polymorphism------------
class CalculateArea{
	void area(float base, int height) {
		float tresult=1/2*(base*height);
		System.out.println(" Area of Tringle is " + tresult);
	}
	void area(int length, int breadth) {
		float rresult=length* breadth;
		System.out.println(" Area of Rectangle is " + rresult);
	}
	float area(float radius) {
		float cresult=3.14f*radius;
		System.out.println(" Area of Circle is " + cresult);
		return cresult;
	}
}

public class CompilePolymorphism{
	public static void main(String[] args) {
		CalculateArea c=new CalculateArea();
		c.area(2f, 25);
		c.area(2, 5);
		c.area(12);
	}

}
