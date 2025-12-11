package Collection;

import java.util.TreeSet;

/**
 * SortedSet- If you want in sorting order
 * 
 * TreeSet- Its a implementation class of sortedSet.
 * Its sort the elements in ascending order.
 * Heterogeneous object is not allowed- if used then its give ClassCastException
 * Null is not allowed- getting NullPointerException
 * 
 * Its allowed Homogeneous Data + Comparable
 * An object is said to be Comparable if and only if the corresponding class implements java.lang.comparable interface.
 * 
 *  String class and all Wrapper classes already implements comparable interface. But String buffers doesnt implements comparable interface.
 *  
 *  h.add(new StringBuffre("A"));
 *  h.add(new  StringBuffer("B"));  // Its giving ClassCastException--->Because StringBuffer is not implements Comparable
 *  
 *  If we are depending on the natural ordering the its should be implements Comparable.
 */

public class SortedSetTreeSet {
	public static void main(String[] args) {
		
		TreeSet h=new TreeSet();
		
		h.add(7);
		h.add(3);
		h.add(3);
	//	h.add(null);// Exception in thread "main" java.lang.NullPointerException --->Null not allowed
	//	h.add("rg");  // Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
		System.out.println(h); // sorted in ascending order
	}
	
} 