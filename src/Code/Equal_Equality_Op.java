package Code;

/*
 * == equality operator check the content as well as the object is the point to the same memory location or not.
 * .equals method used to check only the content of the object. It compare the object and on the basic of that its give the result
 * in form of  
 */
public class Equal_Equality_Op {
	public static void main(String[] args) {
		String str=new String("Ragini");
		String str1="Ragini";
		String str2="Ragini";
		String str3=new String("ragini");
		System.out.println("Equality operator check");
		System.out.println(str==str1); // false-->Because different memory location for both object allocated 
		System.out.println(str1==str2); // true
		System.out.println(str==str3); // false--> New memory address is allocated because new keyword present and its create new memory allocation for each
		System.out.println(". Equal method check");
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
	}
}
