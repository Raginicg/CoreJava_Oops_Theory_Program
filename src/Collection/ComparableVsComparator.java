package Collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * why- If you want to perform the sorting an array its easy, you can do using Collections.sort()
 * but if you want to sort the object (class-Employee where name and id is present) i need to sort multiple
 * variable basic then we are using Comparable and comparator
 * 
 * Comparable- 
 * This interface is present in java.lang package it contains only one method CompareTo().
 * public int CompareTo (Object obj)
 * 
 * obj1.CompareTo(obj2);
 * return -ve if obj1 has to come before obj2
 * return +ve if obj1 has to come after obj2
 * return 0 if obj1 and obj2 are equal
 */
public class ComparableVsComparator {
	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));  //-25 -negative value
		System.out.println("Z".compareTo("A")); // 25 +positive
		System.out.println("A".compareToIgnoreCase("a")); // 0
	//	System.out.println("A".compareTo(null)); // Exception in thread "main" java.lang.NullPointerException:

	System.out.println("Comparator- Custom logic");
	}
}
