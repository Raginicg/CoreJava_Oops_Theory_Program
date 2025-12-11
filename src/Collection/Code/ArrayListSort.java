package Collection.Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<>(List.of("Apple", "Mango", "banana"));
		Collections.sort(arraylist);
		System.out.println("Ascending order sort "+ arraylist);
		
		System.out.println("Arraylist in Descending Order");
		Collections.sort(arraylist, Collections.reverseOrder());
		System.out.println(arraylist);
		System.out.println(Collections.binarySearch(arraylist, "Apple"));
	}

}
