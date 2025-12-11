package Collection;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
	/**
	 * TreeMap- TreeMap uses natural ordering for storing the elements-->Ascending sorted order
	 * Its not stored the Nullkey and value
	 * Heterogeneous data is not allowed
	 */
		TreeMap t=new TreeMap();
		t.put(1, "Rg");
		t.put(4, "Beauty");
		t.put(2, "tt");
	//	t.put("555",4); //ClasscastException
	//	t.put(null, "3"); // NullPointerException
		System.out.println(t);
	}
}
