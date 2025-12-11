package Collection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * ConcurrentHashMap- Null key and value are not allowed. Its a Thread safe, its
 * uses Bucket or segment level locking. Underlying data structure is Hashtable.
 * To perform read operation thread wont require lock but to perform the write
 * or update operation thread requires lock, but it is lock of only a particular
 * part of map (Segment or bucket) instead of total map.
 */
public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentMap m = new ConcurrentHashMap();
		m.put(2, "m");
		m.put(2, "n"); // if already key present then its changed the value with latest one
		m.putIfAbsent(2, "n"); // if key present then not do anything
		m.remove(2, "n"); // its working
		m.put(3, "G");
		m.put(4, "S");
		m.replace(3,"G","Gupta");
		m.replace(4,"Rg");
		System.out.println(m);  // {3=Gupta, 4=Rg}
	}

}
