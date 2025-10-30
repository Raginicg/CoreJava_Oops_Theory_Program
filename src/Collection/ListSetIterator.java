package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListSetIterator {

	public static void main(String[] args) {
		/**
		 * List-List is an index based data structure.
		 * List can store duplicate elements.
		 * It can contain any number of null values.
		 * Its followed the Insertion order.
		 * 
		 * Set- It is not a index based data structure. Its stored data according to hashcode value.
		 * Set contains only unique value, duplicate not allowed. 
		 * It can contain only one null value.
		 * Not maintain the Insertion order.
		 */
		
		List l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(2);
		l1.add(0,13);  // based on index we can add the element in particular position
		System.out.println("List elements "+l1);
		
		// Using Iterator
		Iterator itr=l1.iterator();
		while(itr.hasNext())  // Checking for value present or not in the list--->Boolean form if true then go inside the block
		{
			System.out.println("Iteration "+ itr.next());
		}
		
		// Using ListIterator
		ListIterator listitr=l1.listIterator();
		while(listitr.hasNext())  // backward--->hasPrevious method available in ListIterator
		{
			System.out.println(listitr.next());
		}
		while(listitr.hasPrevious())  // backward--->hasPrevious method available in ListIterator
		{
			System.out.println("List Iterator Backword Compatability");
			System.out.println(listitr.previous());
		}
		Set s=new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(2);
		System.out.println("Set elements are "+ s);
	}

}
