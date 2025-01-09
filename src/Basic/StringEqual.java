package Basic;
/**@author ragigupt
 */

/*
 * The operator == check the content as well as the references of the string, they are equal or not. 
 * Although both of the strings contain the same content, their references 
 * are not equal because both are created by different ways(Constructor and String literal) therefore, a == b is unequal
 *
 *-------Three different ways to compare strings in Java.-----------------
 * 1. Using equals() method (comparing the content)
 * 2. Using == operator (comparing the object reference)
 * 3. Using compareTo() method (comparing strings lexicographically)
 *
 */
public class StringEqual {
public static void main(String[] args) {
	String s1=new String("Spring"); // new object is created
	String s2="Spring";
	String s3="Spring";
	
	System.out.println("s1==s2 "+ s1==s2);  // false
	System.out.println("s1 equal s2 "+ s1.equals(s2));   // true
	System.out.println(s2==s3); // true
}
	
}
