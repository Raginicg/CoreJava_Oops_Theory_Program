package Basic;
/**
 * Generic- Generic used for Type safety. Eliminate the type casting. 
 * Checked at compile time
 */

import java.util.ArrayList;
import java.util.List;

public class GenericsTypes {

	public static void main(String[] args) {
		List list1=new ArrayList<>();
		
		list1.add(1);
		list1.add("Apple");
		// Here in the above you can see if I am not giving any type then I can add any values--->Integer and String value
		
		System.out.println(list1);
		
		// same here you can see if i am defined the type, if i am adding string value then its giving error
		List<Integer> list2=new ArrayList<>();
		
		list2.add(1);
	//	list2.add("Apple");
		// while adding 2nd elements in the list its giving error because its a String type and list is containing Integer value 
		
		System.out.println(list1);
	}
}
