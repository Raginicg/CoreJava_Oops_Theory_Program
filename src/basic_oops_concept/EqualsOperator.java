package basic_oops_concept;

public class EqualsOperator {

/*
 * == operator compare the reference of the java object. It compare the object point to the which memory address and then give thr
 * result in form of true or false.
 * 
 */
	
	public static void main(String[] args) {
		
		String j="Java";
		String p="Java";
		String s= new String("Java");
	
		System.out.println(j==p); // true
		System.out.println((p==s)); // false
	}

}
