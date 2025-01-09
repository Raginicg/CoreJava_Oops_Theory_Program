package Basic;
/**@author ragigupt
 */

/*
 * A class having multiple method with different number of parameter or data type is called method overloading
 * 
 */
public class MethodOverloading {
	void Sum(int a, int b) {
		System.out.println("Addition is " + (a+b) );
	}
//	While changing only the return type we can't achieved the method overloading.
//	String Sum(int a, int b) {
//		System.out.println("Addition is " + (a+b) );
//	}
	void Sum(int a, float b) {
		System.out.println("Addition is "+ (a+b));
	}
public static void main(String[] args) {
	MethodOverloading m=new MethodOverloading();
	m.Sum(2, 10);
	m.Sum(10, 5f);
	
}
}
