package Collection;

/**
 * @author ragigupt
 * --------------------------Collection------------------------
 * java collections are the set of predefined classes and interface that helps programmer to prepare 
 * different kind of data. Like- Searching, Sorting, Traversing.
 * 
 * Need of collection-
 * Array are fixed in size.
 * Array stored only homogeneous data element.
 * 
 * ArrayList-
 * AraryList is a class which is implements to the list interface
 * AraryList contains duplicate elements
 * Can store multiple null values
 * Follow the insertion order
 * ArrayList extends AbstractList class
 * Used add method to add the elements
 */
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>(1);
		// Array creation
		int a[]=new int[1];//declaration and instantiation  
		a[0]=10;
		// a[1]=2;--->
		System.out.println(a[0]);
		
		list.add(2);
		list.add(4);
		System.out.println(list);
		list1.add(9);
		System.out.println(list1);
	}

}
