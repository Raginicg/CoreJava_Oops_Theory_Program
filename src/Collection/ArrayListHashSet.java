package Collection;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * ArrayList-
 * Dynamic in nature
 * AraryList is a class which is implements to the list interface
 * AraryList contains duplicate elements
 * Can store multiple null values
 * Follow the insertion order
 * ArrayList extends AbstractList class
 * Used add method to add the elements
 * 
 * HashSet-
 * Implemented class of Set interface
 * Does not store duplicate elements
 * Contains only one null value
 * HashSet does not follow the insertion order
 * HashSet extends AbstractSet class
 * Used add method to add the elements
 */
public class ArrayListHashSet {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList<>();
		a1.add("apple");
		a1.add(1);
		a1.add(1);
		a1.add(null);
		a1.add(null);
		
		System.out.println("ArrayList elements "+ a1);
		
		HashSet hs=new HashSet<>();
		hs.add("apple");
		hs.add(1);
		hs.add(1);
		hs.add(null);
		
		System.out.println("HashSet elements "+ hs);
		
	}

}
