package Collection;

import java.sql.Array;
/**
 * @author ragigupt
 * --------------------------Collection------------------------
 * java collections are the set of predefined classes and interface that helps programmer to prepare 
 * different kind of data. Like- Searching, Sorting, Traversing.
 * 
 * Need of collection-
 * Array are fixed in size.
 * Array stored only homogeneous data element.
 */
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList< Integer> list=new ArrayList<>();
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
