package basic_oops_concept;

public class StringExp {

/*
 * String is non-primitive datatype because string size is not fixed.
 * String is the sequence of character or array of character.
 * String is a class and many method are predefined and its extends object class.
 * 
 * Q. String object are immutable in java?
 * Ans. String object is not changed once its created.
 * If its value you changed that means you are creating another object.
 * 
 * 
 * Q. String is a final class
 * Q. Difference between String r="Ragini";
 * String r=new String();
 * Ans---> if you used new keyword then 2 object is created (that is Heap and String constant pool)
 * if you create directly then only one object is created in only SCP area.
 * In SCP no garbage collector is used.
 * SCP while creating the object go and check once object is present or not-->if present then its point in same memory address,
 * 
 * Instance Variable stored in---> int a=5;--->Heap Area
 * Static Variable--> static int b=20;---> Method Area
 * void show(){
 * int c=30; \\ local variable inside method
 * }
 * Local variable--->Stack area
 * Test t=new Test();
 * Object stored---> In heap area
 * t.show()--->Stack area
 */
	
/*
 * Whenever you used New keyword for object creation then its create 2 object i.e on heap and string constant pool
 * if you create String s="Ragini";
 * then its create one object in string constant pool. its find the literal value then its not create object again.
 */
	public static void main(String[] args) {
		String r="Ragini"; // only one object created in SCP area
		String r1=new String("Gupta"); // Two object is created
		System.out.println(r);
		System.out.println(r1);
		
	}

}
