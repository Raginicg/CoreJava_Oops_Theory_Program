package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator- Its an Interface, Provide a way to traverse elements by elements.
 */
public class IteratorDemo {
public static void main(String[] args) {
	
	ArrayList<String> str=new ArrayList<>();
	str.add("A");
	str.add("B");
	List<String> str1=new ArrayList<>(List.of("A", "B", "C"));
	
	Iterator<String> itr=str.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
