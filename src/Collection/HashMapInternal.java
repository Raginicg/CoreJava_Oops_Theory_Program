package Collection;

public class HashMapInternal {

	/**
	 * HashMap stored the value in key value form.
	 * When I create the HashMap object then its create the bucket structure internally..
	 * Initial capacity of bucket is 16. Each bucket internally 
	 *
	 * Steps-
	 * Find the hashCode() of the key; keynm.hashCode()
	 * Find bucket index using hashCode  & (length-1)
	 * Check for the Hash Collision--->
	 * No- then add the elements
	 * Yes- key already present??-->NO --> linked List as next nod
	 * yES-->Add to linked list by replacing existing equal node 
	 */
	public static void main(String[] args) {
		java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
		
	}

}
