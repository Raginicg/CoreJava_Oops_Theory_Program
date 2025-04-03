package Code;

import java.util.ArrayList;

public class ConcurrentModification {
	public static void main(String[] args) {
		// this error I get-
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		at Code.ConcurrentModification.main(ConcurrentModification.java:4)

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		for (String s : list) {
			if (s.equals("B")) {
				list.remove(s);
			}

			System.out.println(list);
		}
	}
}
/*
 * Use CopyOnWriteArrayList- CopyOnWriteArrayList is a thread-safe collection
 * that creates a new copy of the list for each structural modification. It does
 * not throw a ConcurrentModificationException during iteration.
 *
 * public static void main(String[] args) { CopyOnWriteArrayList<String> list =
 * new CopyOnWriteArrayList<>(); list.add("A"); list.add("B"); list.add("C");
 * 
 * for (String s : list) { if (s.equals("B")) { list.remove(s); } }
 * 
 * System.out.println(list); }
 */
