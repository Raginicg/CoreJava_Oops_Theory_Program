package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class HashMapInternal {

	/**
	 * HashMap stored the value in key value form.
	 * HashMap is Not synchronized and not thread safe
	 * One null key and multiple null values are allowed,
	 * 
	 * When I create the HashMap object then its create the bucket structure internally..
	 * Initial capacity of bucket is 16. Each bucket internally 
	 *
	 * Steps-
	 * Find the hashCode() of the key; keynm.hashCode()
	 * Find bucket index using hashCode  & (length-1)
	 * Check for the Hash Collision--->
	 * No- then add the elements
	 * Yes- key already present??-->NO --> linked List as next nod
	 * YES-->Add to linked list by replacing existing equal node 
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ragini", 1);
		map.put("beauty", 12);
		map.put("anand", 3);
		System.out.println(map);
		
		System.out.println("LinkedHashMap- Insertion order maintain");
		LinkedHashMap hmap=new LinkedHashMap<>();
		hmap.put("Ragini", 1);
		hmap.put("beauty", 12);
		hmap.put("anand", 3);
		System.out.println(hmap);
	}

}
