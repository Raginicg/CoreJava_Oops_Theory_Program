package Code;
/**@author ragigupt
 */

/* Immutable--->Unchangeable 
 * 
 * When we create a String object it will not change in the future, if we try to change in that then 
 * new object get created with those changes.
 * 
 * Immutable means unchanged or unmodifiable.String class is example of immutable class.
 */
public class StringImmutable {

	public static void main(String[] args) {
		String s="Ragini";
		s.concat(" Gupta"); // Here I have used string concat method for adding this word. But still its give the previous string.
		System.out.println(s);
		//-----------------------Both sysout line give different output because of
		s=s.concat("Munnaprasad");
		System.out.println(s);
		
		String str=new String("Aadya"); // two object created
		// str.concat("gupta"); // not concat
		System.out.println(str=str.concat("gupta")); // concat
		
		}

}
