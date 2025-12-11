package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Its a types of Cursor- Universal cursor and we can used with any collection class.
 * Iterator- Its an Interface, Provide a way to traverse elements by elements.
 * Method- public boolean hasNext()
 * public object next()
 * public void remove()
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
