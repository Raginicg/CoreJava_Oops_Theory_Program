package Collection;

import java.util.HashSet;

/**
 * Underlying data structure is Hashtable, Insertion order not maintained.
 * Null is allowed.
 * best choice for search operation
 */
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h=new HashSet<>();
		h.add("B");
		h.add(1);
		h.add(3);
		h.add("Rg");
		h.add(1);
		h.add("null");
		h.add("null");
		System.out.println(h);
	}
}
