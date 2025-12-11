package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Map- Not part of Collection framework
 * If you want to represents a group of objects as key value pair then we should go for Map.
 * 
 * Method-
 * put(key, value)
 */
public class MapDemo {
public static void main(String[] args) {
	Map< Integer, String> map=new HashMap();
	map.put(1, "Map");
	map.put(2, "Set");
	map.put(1, "List");
//	System.out.println(map);
	
	System.out.println("****************************");
	map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
}
}
