package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Its store the data according to the Hash code value.
 * Its store only unique value not the duplicate value.
 */
public class HashSetDemo {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet(); // in place of String you can give class name also
		Set<String> set1 = new HashSet(); // in place of String you can give class name also

		set.add("R");
		set.add("A");
		set.add("R");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		set1.add("R");
//		set1.add("A");
//		set1.add("R");
//		// Traversing elements
		
//		Iterator<String> itr1 = set1.iterator();
//		while (itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}

	}

}
