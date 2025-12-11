package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *  Need of Concurrent Collection?
 * -Because most of the Tradition collection are Not-Thread safe.
 * -Vector and Hashtable is Thread safe, but at a time only one operation can be perform.
 *	To overcome this problem Concurrent Collection come in the picture.
 *  It a Thread Safe but we can perform multiple operation at a time.
 *  Three Types of Concurrent Collection
 *  -----ConcurrentHashMap
 *  -----CopyOnWriteArrayList
 *  -----CopyOnWriteArraySet
 * 
 * 	ConcurrentModification is the Runtime exception that occurs when a collection is modified during iteration.
 * 
 * ConcurrentMap- Method-
 * put- If already key present then replace the value, with latest value
 * putIfAbsent- If key already present then dont do anything
 * remove
 * replace
 */
public class ConcurrentCollectionD {
public static void main(String[] args) {
	ConcurrentMap m=new ConcurrentHashMap();
	m.put(2, "m");
	m.put(2, "n"); // if already key present then its changed the value with latest one
	m.putIfAbsent(2, "n"); // if key present then not do anything
	m.remove(2, "m"); // remove work when both key and value is matched, here its not worked
	m.remove(2, "n"); // its working
	System.out.println(m);
}
}
