package Collection.Code;

import java.util.ArrayList;

public class ArrayListMethod {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);

		ArrayList<String> a2 = new ArrayList<>();
		a2.add("Ragini");
		a2.add("Gupta");
		System.out.println("Size " + a1.size());  // return the count of the collection

		a1.addAll(a2);
		// add method return boolean result
		System.out.println(a1);
		System.out.println(a1.add("fff"));
		System.out.println(a1);

		System.out.println("Remove Method "+ a1.remove(2)); // Remove the elements whatever index you have specified
		System.out.println("Conatins " + a1.contains(5));

		ArrayList a3 = new ArrayList<>();
		System.out.println(a3.isEmpty()); // Return result true because list is empty

		/**
		 * removeAll---> Remove the common element from the list
		 * clear-----> Remove all the elements from the collection list
		 */
	}
}
