package Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put(new String("Ragini"), "value1");
		map.put(new String("Ragini"), "value2"); // Overwrites previous value
		System.out.println(map.size()); // Output: 1
	
		//HashMap- JVM will check .equals () for find the Duplicate key.
		// Identity HashMap used == operator to find the duplicates.
		
		IdentityHashMap h=new IdentityHashMap<>();
		h.put(1, 2);
		h.put(2, 3);
		h.put(new Integer (1), 2);  // you can see if I used new keyword then its treat as different
		h.put(2, 3); // only one time because key as well as value bth same
		
		System.out.println(h);
		// In the identity hashmap if the same key is present then its take the latest value.
		Map<String, String> map2 = new IdentityHashMap<>();
		map2.put(new String("key"), "value1");
		map2.put(new String("key"), "value2"); // Treated as different keys
		System.out.println(map2.size()); // Output: 2
		
	}
}
//Overwrites previous value