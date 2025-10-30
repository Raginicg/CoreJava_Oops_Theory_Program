package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Iterator- Iterator cursor get by iterator method. 
 * Iterator itr=listobj.iterator();
 * It can be used by any collection of object.
 * Retrieve element by only in forward direction.
 * 
 * ListIterator- ListIterator cursor get by listIterator()
 * It can used by some of the classes ArrayList, LinkedList,Vector and stack
 */
public class ListIteratorDemo {
public static void main(String[] args) {
	List list1=new ArrayList<>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	
//	ListIterator itr=list1.listIterator(); ----->this line not print any thing because in the starting no elements is present because of that condition get false

	ListIterator itr = list1.listIterator(list1.size());   // in the starting no elements is present because of that 

	while(itr.hasPrevious()) {
		System.out.println(itr.previous());
	}
	
}
}
