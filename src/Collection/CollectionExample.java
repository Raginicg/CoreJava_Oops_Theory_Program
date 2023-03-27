package Collection;
/**
 * 
 * @author ragigupt
 *
 * Which collection you used in your project ?
 * List--->ArrayList, LinkedList
 * Set----> HashSet, LinkedHashSet, TreeSet
 * Map---> HashMap
 */
/*
 * Collection- Refer to the store and manipulate group of object
 * Collection means a single unit of object.
 * Interface---> Set, List, Queue, Deque
 * Classes-----> ArrayList, Vector, LinkedList, HashSet, LinkedHashSet, TreeSet, PrioritySet
 */

import java.util.ArrayList;

/*
 * ArrayList ar=new ArrayList<String>();   // Tight coupling because its a class
 * List<String> list=new ArrayList<>();    // Lose coupling because its a interface. // String is generic type its optional
 */
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList< String> a =new ArrayList<>();
		a.add("R");
		a.add("A");
		a.add("G");
		a.add("S");
		System.out.println("List elements are "+ a);
	}
}
