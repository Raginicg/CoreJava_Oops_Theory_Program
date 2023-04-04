package basic_oops_concept;

/*
 * Equals method compare the value of the object not the memory pointing address.
 * Its not checked the same memory location address.
 * 
 */
public class EqualsExp {
//	equals method
	public static void main(String args[]) {
		String j="Spring Boot";
		String p="Spring Boot";
		String e=new String("Spring Boot");
		System.out.println(" Equals method "+ (j.equals(p))); //true
		System.out.println(" Equals method "+ (j.equals(e))); //true
		
/*
 * 	 Equals method-->true
 *   Equals method-->true
 *   Giving output this because its compare only the value not the memory pointing address.
 */
		
	}

}
